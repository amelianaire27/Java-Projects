package tournament;

import java.awt.*;
import java.awt.event.*;
import java.util.Collections;

import javax.swing.*;

@SuppressWarnings("serial")
public class TournamentGUI extends JFrame {

    private JButton jbtSubmit;
    private JButton jbtExport;
    private MatchPanel jplResults;
    private JTextArea jtaStandings;
    private Tournament tournament;
    
    //GUI Constructor
    public TournamentGUI(Tournament t){
	this.tournament = t;
	
	setLayout(new BorderLayout());
	setBackground(Color.DARK_GRAY);
	
	//Add a panel for match result selection
	jplResults = new MatchPanel(t.getTotalNumberOfPlayers());
	jplResults.setBackground(Color.DARK_GRAY);
	jplResults.setPreferredSize(new Dimension(190,150));
	jplResults.displayPairings(tournament);
	add(jplResults, BorderLayout.CENTER);
	
	//Add the text area to display standings and results
	jtaStandings = new JTextArea();
	jtaStandings.setBackground(Color.LIGHT_GRAY);
	jtaStandings.setForeground(Color.BLACK);
	jtaStandings.setFont(new Font("Lucida Console", Font.PLAIN, 16));
	jtaStandings.setPreferredSize(new Dimension(235
		,getFontMetrics(jtaStandings.getFont()).getHeight() 
		* (tournament.getTotalNumberOfPlayers() + 4)));
	jtaStandings.setToolTipText("Current standings as of this round");
	displayStandings();
	add(jtaStandings, BorderLayout.EAST);
	
	//Add a panel for buttons
	JPanel panel2 = new JPanel();
	panel2.setBackground(Color.DARK_GRAY);
	panel2.add(jbtSubmit = new JButton("Submit"));
	jbtSubmit.setFont(new Font("URW Gothic L", Font.BOLD, 12));
	jbtSubmit.setBackground(Color.LIGHT_GRAY);
	jbtSubmit.setToolTipText("Click to submit current round");
	panel2.add(jbtExport = new JButton("Export"));
	jbtExport.setFont(new Font("URW Gothic L", Font.BOLD, 12));
	jbtExport.setBackground(Color.LIGHT_GRAY);
	jbtExport.setToolTipText("Click to export standings to CSV file");
	add(panel2, BorderLayout.SOUTH);
	
	//Listener for the Submit Button
	jbtSubmit.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		
		recordResults(jplResults);
		tournament.incrementCurrentRound();
		displayStandings();
		//System.out.println(tournament.getPlayers());
		
		if(tournament.getCurrentRound() > tournament.getTotalRounds()) 
		    jbtSubmit.setEnabled(false);
		else jplResults.displayPairings(tournament);
	    }
	});
	
	//Listener for the Export Button
	jbtExport.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		tournament.tournamentResults("c:/Users/Default/Documents/tournamentResults.csv");
	    }
	});
	
    }

    //This method "refreshes" the match selection panel
    private void recordResults(Container container) {
	for (Component c : container.getComponents()) {
	    if (c instanceof PlayerRadioButton){
		PlayerRadioButton prb = (PlayerRadioButton)c;
		
		if(prb.isSelected())
		    prb.getPlayer().incrementMatchesWon();
		
		else prb.getPlayer().incrementMatchesPlayed();
	    }
	}
    }
    
    //This method displays the current standings in the JTextArea
    private void displayStandings() {
	if (tournament.getCurrentRound() > tournament.getTotalRounds()) {
	    //jtaStandings.setFont(jtaStandings.getFont().deriveFont(Font.BOLD));
	    jtaStandings.setText("Final Standings \n\n");
	    Collections.sort(tournament.getPlayers());
	}
	else jtaStandings.setText(null);
	
	jtaStandings.append(String.format("%-10s %-5s %-6s%n", "Name", "Wins", "Losses"));
	jtaStandings.append("-----------------------"+'\n');
	
	for(Player el : tournament.getPlayers()){
	    if(el.getRegistrationNum() != 9000)
		jtaStandings.append(el.toString() + '\n');
	}
    }
}
