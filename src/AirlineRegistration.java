// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
	String Fname = JOptionPane.showInputDialog("First name: ");
	String Lname = JOptionPane.showInputDialog("Last name: ");
	String Sbirthday = JOptionPane.showInputDialog("Birthday date (In numbers):");
	int Birthday = Integer.parseInt(Sbirthday);
	String FM = JOptionPane.showInputDialog("Male/Female?: ");
	JOptionPane.showMessageDialog(null, "Airline registration:\n" + "FIRST NAME: \n" + Fname + "\nLAST NAME: \n" + Lname + "\nBIRTHDAY:" );
	}
}




