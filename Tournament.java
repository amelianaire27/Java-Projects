package tournament;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tournament {
    
    //files
    private int totalNumberOfPlayers;
    private ArrayList<Player> players;
    private int currentRound;
    private int totalGames;
    private int totalRounds;
    private int gamesPerRound;

    //ctor
    public Tournament(File f) {
	players = new ArrayList<Player>();
	tournamentReader(f);
	totalNumberOfPlayers = players.size();
	currentRound = 1;
	totalRounds = totalNumberOfPlayers - 1;
	gamesPerRound = totalNumberOfPlayers / 2;
	
	if(totalNumberOfPlayers % 2 == 0)
	    totalGames = totalNumberOfPlayers/2 * (totalNumberOfPlayers - 1);
		
	else totalGames = (totalNumberOfPlayers - 1)/2;
    }
    
    //general methods
    
    //method for reading in .csv file
    private void tournamentReader(File f) {
	int lines = 0;
	String readLine = null;
	String[] splitLine;
	
	try(Scanner reader = new Scanner(f)){

	    while(reader.hasNextLine()){
		readLine = reader.nextLine();
		splitLine = readLine.split(",");
		int registrationNum = Integer.parseInt(splitLine[0]);
		String name = splitLine[1];
		players.add(new Player(registrationNum, name));
		System.out.println(players.get(lines));
		lines++;
	    }

	} catch(FileNotFoundException e){
	    System.err.printf("File %s Not Found%n", f);
	} catch(ArrayIndexOutOfBoundsException | InputMismatchException 
		| NumberFormatException e){
	    System.out.printf("Line %d could not be read%n", lines);
	}
	    
	if (players.size() % 2 == 1)
	    players.add(new Player(9000, "Bye"));
    }
    
    //writes .csv file
    public void tournamentResults(String fileName) {
	try (Formatter writer = new Formatter(fileName)) {
	    for (Player p : players) {
		if (p.getRegistrationNum() != 9000) {
		    writer.format("%d,%s,%d,%d%n", p.getRegistrationNum()
			, p.getName(), p.getMatchesWon(), p.getMatchesPlayed());
		}
	    }
	} catch(FileNotFoundException e) {
	    System.out.printf("%s is an invalid Path or File%n", fileName);
	}
    }
    
    public static void matchResult(Player p1, Player p2) {
	p1.incrementMatchesWon();
	p1.incrementMatchesPlayed();
    }
    
    //getters & "incrementers"
    
    public ArrayList<Player> getPlayers() {
	return players;
    }

    public int getTotalNumberOfPlayers() {
	return totalNumberOfPlayers;
    }

    public int getCurrentRound() {
	return currentRound;
    }
    public void incrementCurrentRound() {
	currentRound++;
    }

    public int getTotalGames() {
	return totalGames;
    }

    public int getTotalRounds() {
	return totalRounds;
    }

    public int getGamesPerRound() {
	return gamesPerRound;
    }
}
