import javax.swing.JOptionPane;

public class SimpleNUmberSorter {
	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		int third = 0;
		int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Type A number"));
		int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Type A number"));
		int Num3 = Integer.parseInt(JOptionPane.showInputDialog("Type A number"));
		// Number 1
		if (Num1 > Num2 && Num1 > Num3) {
			first = Num1;
		} else if (Num1 > Num2 | Num1 > Num3) {
			second = Num1;
		} else {
			third = Num1;
		}
		// Number 2
		if (Num2 > Num1 && Num2 > Num3) {
			first = Num2;
		} else if (Num2 > Num1 | Num2 > Num3) {
			second = Num2;
		} else {
			third = Num2;
		}
		// Number 3
		if (Num3 > Num1 && Num3 > Num2) {
			first = Num3;
		} else if (Num3 > Num1 | Num3 > Num2) {
			second = Num3;
		} else {
			third = Num3;
		}
		JOptionPane.showMessageDialog(null, " " + first + "\n " + second + "\n " + third);

	}
}
