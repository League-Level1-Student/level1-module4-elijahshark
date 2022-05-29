package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {

JButton button = new JButton("joke");	
JButton buton = new JButton("punchline");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void run() {
	frame.add(panel);
	panel.add(button);
	panel.add(buton);
	frame.setVisible(true);
button.addActionListener(this);
buton.addActionListener(this);
	frame.pack();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















































































	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			JOptionPane.showMessageDialog(null, "Did you hear about the claustrophobic astronaut? He just wanted a bit more space.");
		}
		if(e.getSource()== buton) {
			JOptionPane.showMessageDialog(null, "Why did David HasselHoff change his name to The Hoff? It's less of a hassel");
		}
		if(e.getSource() == button);
		if(e.getSource() == buton);
	}

}
