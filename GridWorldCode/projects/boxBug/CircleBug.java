import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
  
  private int radius, distGone;
  
  public CircleBug(int radius) {
    this.radius = radius;
    distGone = 0;
  }
  
  public void act() {
    if(distGone < radius && canMove()) {
      move();
      distGone++;
    } else {
      turn();
      distGone = 0;
    }
  }
}