package _05_typing_tutor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class typing_tutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	public void run() {
			
	}
		char gener ateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
		currentLetter = generateRandomLetter();

	}

}
