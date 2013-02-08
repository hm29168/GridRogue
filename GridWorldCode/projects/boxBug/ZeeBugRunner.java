import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZeeBugRunner {
  public static void main(String args[]) {
    ActorWorld world = new ActorWorld();
    ZeeBug alice = new ZeeBug(3);
    world.add(alice);
    world.show();
  }
}