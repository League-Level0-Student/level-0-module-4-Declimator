import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	

	for(int i = 0; i < 10; i++) {
		String y = JOptionPane.showInputDialog("How did you do on your last test?");
		int score = Integer.parseInt(y);
		if(score>100) {
			JOptionPane.showMessageDialog(null, "liar");
		}
		else if(score==100) {
			JOptionPane.showMessageDialog(null, "Amazing!");
		}
		else if(score>=90) {
			JOptionPane.showMessageDialog(null, "Good job!");
		}
		else if(score>=80) {
			JOptionPane.showMessageDialog(null, "Nice!");
		}
		else if(score>=70) {
			JOptionPane.showMessageDialog(null, ":/");
		}
		else {
			JOptionPane.showMessageDialog(null, "fail");
		}
	}
	
 }
}
