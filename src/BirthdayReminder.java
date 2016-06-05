 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 20th";
		String dadsBirthday = "June 30th";
		String myBirthday = "April 6th";
String Birthday = JOptionPane.showInputDialog("Who's Birthday?"); 
		// 2. Find out which birthday the user wants and and store their response in a variable
	if (Birthday.equals("moms")) {
		speak(momsBirthday);
	}
	if (Birthday.equals("dads")) {
		speak(dadsBirthday);
	}
	if (Birthday.equals("mine")) {
		speak(myBirthday);
	}
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	}
}
