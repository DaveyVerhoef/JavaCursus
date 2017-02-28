package com.soccerleague;

import com.utility.*;

public class Game {
    public Team homeTeam = new Team();
    public Team awayTeam = new Team();
    public Goal[] goals;
    
    public void playGame(int maxGoals) {
        int randomNum = (int)(Math.random()*(maxGoals+1));
        goals = new Goal[randomNum];
        GameUtils.addGameGoals(this);
    }
    
    public void playGame() {
        this.playGame(6);
    }
}
