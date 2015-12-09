package tournament;

import java.util.*;

public class SortTest {
    
    public static void main(String[] args){

//	Tournament tournament = new Tournament(new File("players.txt"));
//	
//	for(int i = 1; i <= tournament.getTotalRounds(); i++) {
//	    tournament.sortPairings();
//	    System.out.println(tournament.getPlayers());
//	}
//	System.out.println();
//	
//	Tournament tournament1 = new Tournament(new File("players1.txt"));
//	
//	for(int i = 1; i <= tournament1.getTotalRounds(); i++) {
//	    tournament1.sortPairings();
//	    System.out.println(tournament1.getPlayers());
//	}

	int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	playerSort(numbers);
	System.out.println(Arrays.toString(numbers));
	
	Arrays.sort(numbers);
	playerSort2(numbers, 1);
	System.out.println(Arrays.toString(numbers));
	
	printPairings(numbers);
	
	Arrays.sort(numbers);
	playerSort2(numbers, 2);
	System.out.println(Arrays.toString(numbers));
	printPairings(numbers);
//	for (int i = 1; i < 9; i++) {
//	    System.out.println(1 + i%6 );
//	}
//	
//	pairingSort(numbers, 1);
//	System.out.println(Arrays.toString(numbers));
	
	
    }
    
    private static void pairingSort(int[] numbers, int currentRound) {
	//Integer temp1 = null;
	//Integer temp2 = null;
	
	for (int i = 1; i < numbers.length; i++) {
	    numbers[i] = (numbers[i] + currentRound) % 6; 
		    //(numbers.length - 1);
	}
	
    }
    
    private static void playerSort2(int[] numbers, int currentRound) {
	Integer temp = null;
	
	for(int j = 0; j < currentRound; j++){
	    for(int i = numbers.length - 1; i > 0; i--){

		if(i == numbers.length - 1)
		    temp = numbers[i];

		numbers[i] = numbers[i - 1];

		if(i == 1)
		    numbers[i] = temp;
	    } 
	}
    }
    
    private static void printPairings(int[] numbers) {
	for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
	    System.out.printf("%d vs %d%n", numbers[i], numbers[j]);
	}
    }

    private static void playerSort(int[] numbers) {
	Integer temp = null;
	for(int i = numbers.length - 1; i > 0; i--){
	    
	    if(i == numbers.length - 1)
		temp = numbers[i];
	    
	    numbers[i] = numbers[i - 1];
	    
	    if(i == 1)
		numbers[i] = temp;
	}
    }
}
