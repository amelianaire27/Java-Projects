package tournament;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MatchPanel extends JPanel {
    //fields
    private GridBagConstraints gbc = new GridBagConstraints();
    private int[] assignments;
    
    //ctor
    public MatchPanel(int n) {
	setLayout(new GridBagLayout());
	gbc.anchor = GridBagConstraints.WEST;
	
	assignments = new int[n];
	for (int i = 0; i < assignments.length; i++) {
	    assignments[i] = i;
	}
    }
    
    //general methods
    public void displayPairings(Tournament t) {
	removeAll();
	sortPairings();
	
	PlayerRadioButton prb1;
	PlayerRadioButton prb2;
	ButtonGroup[] bGroups = new ButtonGroup[t.getGamesPerRound()];
	
	for (int i = 0, j = t.getPlayers().size() - 1; i < j; i++, j--) {
	    Player p1 = t.getPlayers().get(assignments[i]);
	    Player p2 = t.getPlayers().get(assignments[j]);
	    bGroups[i] = new ButtonGroup();
	    
	    gbc.gridx = 0;
	    gbc.gridy = i;
	    
	    if (p1.getRegistrationNum() == 9000) {
		addByeLabel();
		
		gbc.gridx++;
		
		add(prb2 = new PlayerRadioButton(p2, true), gbc);
		bGroups[i].add(prb2);
	    }
	    
	    else if (p2.getRegistrationNum() == 9000) {
		add(prb1 = new PlayerRadioButton(p1, true), gbc);
		bGroups[i].add(prb1);
		
		gbc.gridx++;
		
		addByeLabel();
	    }
	    
	    else {
		add(prb1 = new PlayerRadioButton(p1), gbc);
		
		gbc.gridx++;
		
		add(prb2 = new PlayerRadioButton(p2), gbc);
		
		bGroups[i].add(prb1);
		bGroups[i].add(prb2);
	    }
	}
	
	updateUI();
    }
    
    private void sortPairings() {
	Integer temp = null;
	for(int i = assignments.length - 1; i > 0; i--) {
	    if(i == assignments.length - 1)
		temp = assignments[i];

	    assignments[i] = assignments[i - 1];

	    if(i == 1)
		assignments[i] = temp;
	}
    }
    
    private void addByeLabel() {
	JLabel lblBye;
	
	gbc.anchor = GridBagConstraints.CENTER;
	add(lblBye = new JLabel("(Bye)"), gbc);
	lblBye.setForeground(Color.WHITE);
	lblBye.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 16));
	gbc.anchor = GridBagConstraints.WEST;
    }
}
