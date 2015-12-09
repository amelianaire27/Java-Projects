package tournament;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PlayerRadioButton extends JRadioButton{
    
    private Player player;
    
    public PlayerRadioButton(Player p) {
	this.player = p;
	super.setText(p.getName());
	super.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 16));
	super.setBackground(Color.DARK_GRAY);
	super.setForeground(Color.WHITE);
	super.setToolTipText("Select the player who won this round");
    }
    
    public PlayerRadioButton(Player p, boolean b) {
	this.player = p;
	super.setText(p.getName());
	super.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 16));
	super.setBackground(Color.DARK_GRAY);
	super.setForeground(Color.WHITE);
	super.setToolTipText("Select the player who won this round");
	this.setSelected(b);
	this.setEnabled(!b);
    }
    
    public Player getPlayer() {
	return player;
    }
}
