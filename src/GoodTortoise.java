import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
public class GoodTortoise {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("Color?");
	if (color.equals("blue")) {
		Tortoise.setPenColor(Color.BLACK);
	}
	if (color.equals("red") || color.equals("blood red")) {
		Tortoise.setPenColor(Color.RED);
	}
	if (color.equals("green")) {
		Tortoise.setPenColor(Color.GREEN);
	}
	if (color.equals("cyan")) {
		Tortoise.setPenColor(Color.CYAN);
	}
	int sides = Integer.parseInt(JOptionPane.showInputDialog("How Many Sides?"));
	for (int i = 0; i < sides; i++) {
		
		Tortoise.setSpeed(10);
		Tortoise.turn(360 / sides);
		Tortoise.move(360 / sides);
		
	}
	
	
	
	
	
	
	
	
	
		
}

	
	

}
