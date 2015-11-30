package roundrobin;

import java.io.*;
import java.util.*;

public class PlayerTest {

    public static void main(String[] args) {
	
	//File players1 = new File("players1.txt");
	File players2 = new File("players2.txt");
	List<Player> players = new ArrayList<>();
	
	try (Scanner input = new Scanner(new File("players.txt"))){
	    while (input.hasNextLine()){
		int registrationNum = input.nextInt();
		String name = input.next();
		input.nextLine();
		//int matchesPlayed = input.nextInt();
		//int matchesWon = input.nextInt();
		
		players.add(new Player(name, registrationNum));
	    }
	} catch (FileNotFoundException e){
	    System.out.println("File players.txt not found");
	}
	
	for (Player el : players){
	    System.out.println(el);
	}
	System.out.println();
	
	/*for (Player el : players){
	    el.setName(new File("players1.txt"));
	    el.setMatchesPlayed(new File("players1.txt"));
	    //el.setMatchesWon(new File("players1.txt"));
	    //System.out.println(el);
	}*/
	//System.out.println();
	
	/*for (Player el : players){
	    el.setMatchesWon(new File("players1.txt"));
	    System.out.println(el);
	}
	for (Player el : players){
	    el.setName(players2);
	    System.out.println(el);
	}
	System.out.println();
	
	players.get(0).setMatchesWon(players1);
	System.out.println(players.get(0));*/
    }
}
