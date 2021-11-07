package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	JButton Trick = new JButton("Trick");
	JButton Treat = new JButton("Treat");
JFrame Frame = new JFrame();
JPanel Panel = new JPanel();
public void run() {
	Frame.add(Panel);
	Panel.add(Treat);
	Panel.add(Trick);
	Frame.setVisible(true);
Frame.pack();
Trick.addActionListener(this);
Treat.addActionListener(this);




}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
System.out.println("boOoOOOOoOo");	
}














}
