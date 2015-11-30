package rockpaperscissors;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GuiWindow extends JFrame{
	
	public GuiWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(GuiWindow.class.getResource("/rockpaperscissors/paper.jpg")));
		button.setSize(128, 128);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(GuiWindow.class.getResource("/rockpaperscissors/rock.jpg")));
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(GuiWindow.class.getResource("/rockpaperscissors/scissors.jpg")));
		panel.add(button_2);
		
		JLabel label = new JLabel("");
		getContentPane().add(label, BorderLayout.CENTER);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RockPaperScissors human = RockPaperScissors.PAPER;
				RockPaperScissors aI = RockPaperScissors.randomChoice();
				label.setText(RockPaperScissors.gameChoice(human, aI));
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RockPaperScissors human = RockPaperScissors.ROCK;
				RockPaperScissors aI = RockPaperScissors.randomChoice();
				label.setText(RockPaperScissors.gameChoice(human, aI));
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RockPaperScissors human = RockPaperScissors.SCISSORS;
				RockPaperScissors aI = RockPaperScissors.randomChoice();
				label.setText(RockPaperScissors.gameChoice(human, aI));
			}
		});
	}
}
