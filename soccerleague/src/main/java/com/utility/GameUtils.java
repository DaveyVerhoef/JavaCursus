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
            currGoal.teamName = Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam();
            currGoal.playerName.name = currGoal.teamName.players[(int) (Math.random() * currGoal.teamName.players.length)];
            currGoal.timeScored = (int) (Math.random() * 90);
            currGame.goals[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.goals, (g1, g2) -> Double.valueOf(g1.timeScored).compareTo(Double.valueOf(g2.timeScored)));

    }
}