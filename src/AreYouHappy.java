import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String Mood = JOptionPane.showInputDialog("Are You Happy");
	if (Mood.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
	} else if (Mood.equalsIgnoreCase("no")) {
		String Try = JOptionPane.showInputDialog("Do You Want To Be Happy");
		if (Try.equalsIgnoreCase("Yes")){
			JOptionPane.showMessageDialog(null, "Watch Youtube And Be Happy");
		} else if (Try.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");			
			
		}
	}
}
}
