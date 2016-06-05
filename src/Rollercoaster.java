import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
int	height = Integer.parseInt(JOptionPane.showInputDialog("Height in inches:"));
int heightinfeet = height / 12;
if (heightinfeet >= 4) {
	speak("you may pass");
}
else {
	speak("YOU. SHALL. NOT. PASS.");
}
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}
}
