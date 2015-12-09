package tournament;

import java.io.*;

import javax.swing.JFrame;

public class TournamentApp {
    public static void main(String[] args){
		
	File playerFile = new File("players2.csv");
	Tournament tournament1 = new Tournament(playerFile);
	
	TournamentGUI frame = new TournamentGUI(tournament1);
	frame.setTitle("Round Robin Tournament");
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
