package rockpaperscissors;

import java.util.Random;

import javax.swing.ImageIcon;


/*
 * @author Amelia White
 * 
 */

public enum RockPaperScissors {
	
	//constants
	/*
	 * 0 is rock
	 * 1 is paper
	 * 2 is scissors
	 * 
	 * Scissors cuts paper
	 * Paper covers rock
	 * Rock crushes scissors
	 * 
	 */
	
	ROCK (new ImageIcon(RockPaperScissors.class.getResource("rock.jpg"))), 
	PAPER (new ImageIcon (RockPaperScissors.class.getResource("paper.jpg"))), 
	SCISSORS (new ImageIcon (RockPaperScissors.class.getResource("scissors.jpg")));
	
	//fields
	
	private final ImageIcon image;
	
	//constructor
	
	private RockPaperScissors (ImageIcon i){
		
		image = i;
	}
	
	//methods
	
	public static String gameChoice (RockPaperScissors userPick, RockPaperScissors aiPick){
		
		switch(userPick){
		case ROCK:
			if(aiPick == ROCK){
				return "You tied!";
			}
			if(aiPick == PAPER){
				return "You lose!";
			}
			if(aiPick == SCISSORS){
				return "You win!";
			}
			break;
		case PAPER:
			if(aiPick == PAPER){
				return "You tied!";
			}
			if(aiPick == SCISSORS){
				return "You lose!";
			}
			if(aiPick == ROCK){
				return "You win!";
			}
			break;
		case SCISSORS:
			if(aiPick == SCISSORS){
				return "You tied!";
			}
			if(aiPick == ROCK){
				return "You lose!";
			}
			if(aiPick == PAPER){
				return "You win!";
			}
			break;
			
		}
		return "Something went wrong!";
	}
	
	public static RockPaperScissors randomChoice() {
	    int pick = new Random().nextInt(RockPaperScissors.values().length);
	    return RockPaperScissors.values()[pick];
	}
	
	

}
