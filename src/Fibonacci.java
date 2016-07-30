import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
	int prevNum = 0;
	int thisNum = 1;
	int NextNum = 0;
	JOptionPane.showMessageDialog(null, "1");
	for (int i = 0; i < 50; i++) {
		NextNum = prevNum + thisNum;
		JOptionPane.showMessageDialog(null, NextNum);
		prevNum = thisNum;
		thisNum = NextNum;
	}
}
}
