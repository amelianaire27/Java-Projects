package tournament;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GridBagTest extends JPanel {
    
    JRadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    GridBagConstraints gbc = new GridBagConstraints();
    
    public GridBagTest() {
	setLayout(new GridBagLayout());
	gbc.anchor = GridBagConstraints.WEST;
	
	b1 = new JRadioButton("One");
	gbc.gridx = 0;
	gbc.gridy = 0;
	add(b1, gbc);
	
	b2 = new JRadioButton("Two");
	gbc.gridx = 1;
	gbc.gridy = 0;
	add(b2, gbc);
	
	b3 = new JRadioButton("Three");
	gbc.gridx = 0;
	gbc.gridy = 1;
	add(b3, gbc);
	
	b4 = new JRadioButton("Elveneteen");
	gbc.gridx = 1;
	gbc.gridy = 1;
	add(b4, gbc);
	
	b5 = new JRadioButton("Five");
	gbc.gridx = 0;
	gbc.gridy = 2;
	add(b5, gbc);
	
	b6 = new JRadioButton("Six");
	gbc.gridx = 1;
	gbc.gridy = 2;
	add(b6, gbc);
	
	b7 = new JRadioButton("Seven");
	gbc.gridx = 0;
	gbc.gridy = 3;
	add(b7, gbc);
	
	b8 = new JRadioButton("Eight");
	gbc.gridx = 1;
	gbc.gridy = 3;
	add(b8, gbc);
	
	b9 = new JRadioButton("Funfhundertfunfundfunfzig");
	gbc.gridx = 0;
	gbc.gridy = 4;
	add(b9, gbc);
    }
    
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.add(new GridBagTest());
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }
}
