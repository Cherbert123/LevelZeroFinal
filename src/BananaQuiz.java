// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String YN = JOptionPane.showInputDialog("Do you like Bananas?");
		//2. if they say no, 
		if (YN.equals("yes")) {
			String Hobby = JOptionPane.showInputDialog("What is your favorite hobby:");
			JOptionPane.showMessageDialog(null, Hobby + " is much better with bananas");
		}
		if (YN.equals("no")) {
			JOptionPane.showMessageDialog(null, "You're crazy and should eat bananas untill you like them");

		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
