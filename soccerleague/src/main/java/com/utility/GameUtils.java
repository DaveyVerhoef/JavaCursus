/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.utility;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import com.soccerleague.*;


public class GameUtils {

    public static void addGameGoals(Game currGame) {
        
        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.goals == null) {
            currGame.goals = new Goal[(int) (Math.random() * 10)];   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currGame.goals) {
            currGoal = new Goal();
            currGoal.teamName = Math.random() > 0.5 ? getHomeTeam(currGame, "home") : getHomeTeam(currGame, "away");
            currGoal.playerName.name = currGoal.teamName.players[(int) (Math.random() * currGoal.teamName.players.length)];
            currGoal.timeScored = (int) (Math.random() * 90);
            currGame.goals[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.goals, (g1, g2) -> Double.valueOf(g1.timeScored).compareTo(Double.valueOf(g2.timeScored)));

    }

    // Uses reflection so works with getter method or public field
    private static Team getHomeTeam(Game currGame, String homeOrAway) {
        Team theTeam = null;
        Method m;
        Field f;
        try {
            m = Game.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1) + "Team");
            theTeam = (Team)m.invoke(currGame);
            //System.out.println(theTeam);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Game.class.getField(homeOrAway + "Team");
                theTeam = (Team)f.get(currGame);
                //System.out.println(theTeam);
            } catch (NoSuchFieldException|IllegalAccessException ef) { 
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theTeam;
    }
}