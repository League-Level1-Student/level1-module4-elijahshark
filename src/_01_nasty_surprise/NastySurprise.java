package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3Dw9LtLV-3n6c&psig=AOvVaw0zE5oQ90Jz23_noPA-79cV&ust=1637607190952000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCPCyq6uQqvQCFQAAAAAdAAAAABAD");
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}













}
