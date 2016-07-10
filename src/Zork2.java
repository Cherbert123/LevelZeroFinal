import javax.swing.JOptionPane;

public class Zork2 {
	 static int inventory = 0;
public static void main(String[] args) {
	String First = JOptionPane.showInputDialog("You Got Locked in a dimmly lit Room.\n The Room has a vent and Door");
	if (First.equalsIgnoreCase("Open Door")) {
		 First = JOptionPane.showInputDialog("Can't, It's Locked");
		
	}
	if (First.equalsIgnoreCase("Open Vent")) {
		First = JOptionPane.showInputDialog("Opened");
		if (First.equalsIgnoreCase("Climb Vent")){
			First = JOptionPane.showInputDialog("You Cilmbed Up The Vent Into Another Room. \n The Room Has a Desk With a lamp on It ");
			if (First.equalsIgnoreCase("Open Desk")){
				First = JOptionPane.showInputDialog("There is a key inside the desk");
			}
			if (First.equalsIgnoreCase("Take Lamp")){
				inventory++;
				First = JOptionPane.showInputDialog("You took the lamp and heard a clicking sound. \n You can't open the desk");
				
			}
		}
		}
}
}
