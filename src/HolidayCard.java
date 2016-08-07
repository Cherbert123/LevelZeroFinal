import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	void drawTreeTrunk(){
		Tortoise.turn(200);
		Tortoise.setPenColor(Color.BLACK);
		Tortoise.setPenWidth(15);
		Tortoise.penDown();
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(60);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(60);
		Tortoise.turn(90);
		
	}
	void drawStar(){
		for (int i = 0; i < 5; i++) {
			Tortoise.setPenColor(Color.YELLOW);
			Tortoise.penDown();
			Tortoise.move(50);
			Tortoise.turn(50);
			
		}
	}
	void drawTreeBody(){
		int LegenthTree = 90;
		int LeftRight = 1;
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.penDown();
		for (int i = 0; i < 8; i++) {
			Tortoise.move(LegenthTree);
			if (LeftRight == 1) {
				Tortoise.turn(200);
				LeftRight = 2;
				
			} else {
				Tortoise.turn(-200);
				LeftRight = 1;
				LegenthTree = LegenthTree + 18;
			}
		}
		
	}
	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		
		
		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
		
		// Use the writeGreeting() method to add a festive message
		
	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth/5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}


