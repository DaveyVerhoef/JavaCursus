package soccerleague;

public class SoccerLeague {

    public static void main(String[] args) {
        int i = 0;
        
        Team team1 = new Team();
        Team team2 = new Team();
        team1.name = "Arsenal";
        team2.name = "Chelsea";
        team1.player1.name = "Welbz";
        team1.player2.name = "Alexis";
        team1.player3.name = "Özil";
        team1.players[0] = team1.player1.name;
        team1.players[1] = team1.player2.name;
        team1.players[2] = team1.player3.name;
        team2.player1.name = "Shit1";
        team2.player2.name = "Shit2";
        team2.player3.name = "Shit3";
        team2.players[0] = team2.player1.name;
        team2.players[1] = team2.player2.name;
        team2.players[2] = team2.player3.name;        
        
        Game game1 = new Game();
        game1.homeTeam = team1;
        game1.awayTeam = team2;
        
        Goal goal1 = new Goal();
        game1.goals[i] = goal1;
        game1.goals[i].playerName.name = "Welbz";
        game1.goals[i].teamName.name = "Arsenal";
        game1.goals[i].timeScored = 05.55;
        i++;
        Goal goal2 = new Goal();
        game1.goals[i] = goal2;
        game1.goals[i].playerName.name = "Welbz";
        game1.goals[i].teamName.name = "Arsenal";
        game1.goals[i].timeScored = 15.55;
        i++;
        Goal goal3 = new Goal();
        game1.goals[i] = goal3;
        game1.goals[i].playerName.name = "Welbz";
        game1.goals[i].teamName.name = "Arsenal";
        game1.goals[i].timeScored = 25.55;
        i++;
        
        System.out.println(game1.homeTeam.name + ":");
        for (String player : game1.homeTeam.players) {
            if (player != null)
                System.out.println(player);
        }
        System.out.println();
        System.out.println(game1.awayTeam.name + ":");
        for (String player : game1.awayTeam.players) {
            if (player != null)
                System.out.println(player);
        }
        System.out.println();
        System.out.println("Goals:");
        
        for (Goal goal : game1.goals) {
            if (goal != null) {
                System.out.println("Goal scored after " + goal.timeScored + " mins by "
                + goal.playerName.name + " of " + goal.teamName.name);
            }
        }
        
    }
    
}
