// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {


	String	Nickels = JOptionPane.showInputDialog("How many nickels:");
	
	int NickelNum = Integer.parseInt(Nickels);

		
String	Dimes = JOptionPane.showInputDialog("How many dimes:");
	
	int DimesNum = Integer.parseInt(Dimes);
		
String	Quarters = JOptionPane.showInputDialog("How many quarters:");
	
	int QuarterNum = Integer.parseInt(Quarters);
		
int Change = QuarterNum * 25 + DimesNum * 10 + NickelNum * 5;
double TotalChange = Change/100.00;
		JOptionPane.showMessageDialog(null, TotalChange);

	}
}

