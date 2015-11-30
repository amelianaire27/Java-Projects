package roundrobin;

import static org.junit.Test.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TournamentTest {
	
	@Test
	public void testTotalGames() {
		HashSet<Player> players = new HashSet<Player>(){
			Player p1;
			Player p2;
		};
		Tournament t = new Tournament(new File("players.txt"), players);
		
		assertEquals("Total games was not 5", 0, t.totalGames(10));
		
	}

}
