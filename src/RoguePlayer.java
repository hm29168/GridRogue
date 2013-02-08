import java.awt.event.*;
import java.lang.Character;
import info.gridworld.grid.*;

public class RoguePlayer extends Dude implements KeyListener {
	
	Location current = getLocation();
	
	public void act(){
		current = getLocation();
		System.out.println("hurr durr");
	}

	public void keyPressed(KeyEvent event) {
	}

	public void keyReleased(KeyEvent event) {
	}

	public void keyTyped(KeyEvent event) {
		System.out.println("blah");
		if (Character.toLowerCase(event.getKeyChar()) == 'w') {
			System.out.println("IN HERE!");
			act();
			Location north = current.getAdjacentLocation(Location.NORTH);
			moveTo(north);
		}
	}
}