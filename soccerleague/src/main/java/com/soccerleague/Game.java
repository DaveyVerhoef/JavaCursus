package com.soccerleague;

import com.utility.*;

public class Game {
    public Team homeTeam = new Team();
    public Team awayTeam = new Team();
    public Goal[] goals;
    
    public void playGame(int maxGoals) {
        int randomNum = (int)(Math.random()*(maxGoals));
        goals = new Goal[randomNum];
        GameUtils.addGameGoals(this);
    }
    
    public void playGame() {
        this.playGame(6);
    }
    
    public Team getHomeTeam() {
      return this.homeTeam;
    }
    
    public Team getAwayTeam() {
      return this.awayTeam;
    }
}
