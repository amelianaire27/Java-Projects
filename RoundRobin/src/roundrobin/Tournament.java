package roundrobin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Tournament {
	
	private int	totalNumberOfPlayers;
	private HashSet<Player> players;
	
	public Tournament(File f, HashSet<Player> participants){
		players = participants;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("players.txt"));
			int lines = 0;
			while (reader.readLine() != null){
				lines++;
			}
			totalNumberOfPlayers = lines;
		} catch(FileNotFoundException e){
			System.err.println("FileNotFoundException");
		} catch (IOException e) {
			System.err.println("IOException");
		}
	}
	
	public int totalGames(int n){
		n = totalNumberOfPlayers;
		int total;
		
		if(n%2 == 0){
			total = n/2*(n-1);
		}
		else {
			total = (n-1)/2;
		}
		
		return total;
		
	}
	
	public Player matchWinner(Player p1, Player p2){
		
		return p1;
		
	}
	
	public File tournamentResults(){
		return null;
		
	}
	
	

}
