import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.*;
import info.gridworld.actor.Bug;

/**
* This class runs a world that contains box bugs.
* This class is not tested on the AP CS A and AB exams.
 */

public class GridRogueRunner {
	
	public static void main(String[] args) {
	    ActorWorld world = new ActorWorld();
	    Bug alice = new Bug();
	    alice.setColor(Color.ORANGE);
	    Bug bob = new Bug();
	    world.add(new Location(7, 8), alice);
	    world.add(new Location(5, 5), bob);
	    world.show();
	}

}
