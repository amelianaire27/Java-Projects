package rockpaperscissors;

import java.util.Random;

import javax.swing.JFrame;


public class GameApp {
	
	public static void main(String [] args){
		
		GuiWindow app = new GuiWindow();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(750,750);
		app.setVisible(true);
		app.setTitle("Rock Paper Scissors!");
		
	}
	
	private RockPaperScissors randomChoice() {
	    int pick = new Random().nextInt(RockPaperScissors.values().length);
	    return RockPaperScissors.values()[pick];
	}

}
