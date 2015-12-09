package tournament;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PlayerButton extends JButton{

    private Player player;
    
    public PlayerButton(Player p) {
	this.player = p;
	super.setText(p.getName());
    }
    
    public Player getPlayer() {
	return player;
    }
}
