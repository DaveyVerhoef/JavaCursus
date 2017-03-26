package com.soccerleague;

public class App {
    public static Team[] teams = new Team[10];
    public static Game[] games = new Game[100];
    public static int numOfGames = 4;
    public static int maxGoals = 6;
    
    static void createTeams() {
        Team team1 = new Team("Arsenal", "DatGuy Welbz", "Alexis Sanchez", "Mesut Özil");
        Team team2 = new Team("Chelsea", "William", "Courtois", "Hazard");
        Team team3 = new Team("Man Utd", "Rooney", "Ibrahimovic", "Blind");
        Team team4 = new Team("Liverpool", "Wijnaldum", "Mane", "Coutinho");
        
        teams[0] = team1;
        teams[1] = team2;
        teams[2] = team3;
        teams[3] = team4;
    }
    
    static void createGames(int numGames) {
        for (int i = 0; i < numGames; i++) {
            Game game = new Game();
            int teamNumHome = (int)(Math.random()*(4));
            int teamNumAway = (int)(Math.random()*(4));
            while (teamNumAway == teamNumHome) {
                teamNumAway = (int)(Math.random()*(4));
            }
            game.homeTeam = teams[teamNumHome];
            game.awayTeam = teams[teamNumAway];
            games[i] = game;
        }
    }
    
    static void printGoals() {
        for (int i = 0; i < numOfGames; i++) {
            System.out.println("New game!");
            System.out.println("");
            for (Goal goals : games[i].goals) {
                if (goals != null) {
                    double timeScored = goals.timeScored;
                    String playerName = goals.playerName.name;
                    String teamName = goals.teamName.name;
                    System.out.println("Goal scored after " + timeScored + " mins by " + playerName + " of " + teamName);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createTeams();
        createGames(numOfGames);
        for (int i = 0; i < numOfGames; i++)
          games[i].playGame(maxGoals);
        printGoals();
       
    } // main
    
} // SoccerLeague