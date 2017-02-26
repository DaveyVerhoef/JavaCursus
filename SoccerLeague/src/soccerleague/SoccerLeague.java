package soccerleague;

public class SoccerLeague {
    public static Team[] teams = new Team[10];
    public static Game[] games = new Game[100];
    
    static void createTeams() {
        Team team1 = new Team("Arsenal", "DatGuy Welbz", "Alexis Sanchez", "Mesut Özil");
        Team team2 = new Team("Chelsea", "Fucking Shit1", "Fucking Shit2", "Fucking Shit3");
        
        teams[0] = team1;
        teams[1] = team2;
    }
    
    static void createGames(Team[] teams) {
        Game game1 = new Game();
        game1.homeTeam = teams[0];
        game1.awayTeam = teams[1];
        games[0] = game1;
    }
    
    static void printGoals() {
        for (Goal goals : games[0].goals) {
            if (goals != null) {
                double timeScored = goals.timeScored;
                String playerName = goals.playerName.name;
                String teamName = goals.teamName.name;
                System.out.println("Goal scored after " + timeScored + " mins by " + playerName + " of " + teamName);
            }
        }
    }

    public static void main(String[] args) {
        
        createTeams();
        createGames(teams);
        games[0].playGame();
        printGoals();
       
    } // main
    
} // SoccerLeague
