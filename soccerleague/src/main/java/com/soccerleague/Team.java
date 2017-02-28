package com.soccerleague;

public class Team {
    public String name;
    public Player player1 = new Player();
    public Player player2 = new Player();
    public Player player3 = new Player();
    /*
    public Player player4 = new Player();
    public Player player5 = new Player();
    public Player player6 = new Player();
    public Player player7 = new Player();
    public Player player8 = new Player();
    public Player player9 = new Player();
    public Player player10 = new Player();
    public Player player11 = new Player();
    */
    public String[] players = new String[3];
    
    public Team() {}
    
    public Team(String name, String player1, String player2, String player3) {
        this.name = name;
        this.player1.name = player1;
        this.player2.name = player2;
        this.player3.name = player3;
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
    }
}
