package tournament;

public class Player implements Comparable<Player>{

    //fields
    
    private int registrationNum;
    private String name;
    private int matchesWon;
    private int matchesPlayed;
    
    //ctor
    
    public Player(int rNum, String n){
	registrationNum = rNum;
	name = n;
	matchesWon = 0; 
	matchesPlayed = 0;
    }
    
    //getters and setters
    public int getRegistrationNum() {
        return registrationNum;
    }

    public String getName() {
        return name;
    }
    
    public int getMatchesWon() {
        return matchesWon;
    }
    public void incrementMatchesWon() {
    	matchesWon++;
    	matchesPlayed++;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public void incrementMatchesPlayed() {
    	matchesPlayed++;
    }
    
    @Override
    public String toString() {
	return String.format("%-10s %-5d %-6d", name, matchesWon, matchesPlayed - matchesWon);
    }
    
    @Override
    public int compareTo(Player other) {
	return Integer.compare(other.getMatchesWon(), this.getMatchesWon());
    }
}
