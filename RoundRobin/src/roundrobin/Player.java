package roundrobin;

//import java.io.*;
//import java.util.Scanner;

public class Player {

    //fields
    
    private int registrationNum;
    private String name;
    private int matchesPlayed;
    private int matchesWon;
    
    //ctor
    
    public Player(String n, int rNum){
	registrationNum = rNum;
	name = n;
	matchesPlayed = 0; 
	matchesWon = 0;
    }
    
    //getters and setters

    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
	
	this.name = name;
	
	/*try (Scanner input = new Scanner(f)){
            while (input.hasNextLine()){
        	int registrationNumTemp = input.nextInt();
        	if (registrationNumTemp == this.registrationNum)
        	    this.name = input.next();
        	else
        	    input.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.printf("File %s not found%n", f.getName());
        }*/
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
	
	this.matchesPlayed = matchesPlayed;
	
	/*try (Scanner input = new Scanner(f)){
            while (input.hasNextLine()){
        	int registrationNumTemp = input.nextInt();
        	if (registrationNumTemp == this.registrationNum){
        	    input.next();
        	    this.matchesPlayed = input.nextInt();
        	}
        	else
        	    input.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.printf("File %s not found%n", f.getName());
        }*/
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
	
	this.matchesWon = matchesWon;
	
	/*try (Scanner input = new Scanner(f)){
            while (input.hasNextLine()){
        	int registrationNumTemp = input.nextInt();
        	if (registrationNumTemp == this.registrationNum){
        	    input.next();
        	    input.nextInt();
        	    this.matchesWon = input.nextInt();
        	}
        	else
        	    input.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.printf("File %s not found%n", f.getName());
        }*/
    }
    
    @Override
    public String toString() {
	return String.format("%-4d %-10s %-2d %-2d", registrationNum, name, matchesPlayed, matchesWon);
    }
}
