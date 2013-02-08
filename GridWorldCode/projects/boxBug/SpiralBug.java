import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
  
  private int spiralArm, distGone;
  
  public SpiralBug(int initialLength) {
    spiralArm = initialLength;
    distGone = 0;
  }
  
  public void act() {
    if(distGone < spiralArm && canMove()) {
      move();
      distGone++;
    } else {
      turn();
      turn();
      distGone = 0;
      spiralArm++;
    }
  }
}