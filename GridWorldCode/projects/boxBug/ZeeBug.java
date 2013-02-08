import info.gridworld.actor.Bug;

public class ZeeBug extends Bug {
  
  private int zeeArmLength, distGone;
  boolean isDone, firstArm, secondArm;
  
  public ZeeBug(int zeeArmLength) {
    this.zeeArmLength = zeeArmLength;
    distGone = 0;
    isDone = false;
    firstArm = false;
    secondArm = false;
    setDirection(90);
  }
  
  public void act() {
    if(!canMove()) {
      isDone = true;
    }
    
    if(!isDone) {
      if(distGone < zeeArmLength) {
        move();
        distGone++;
      } else { 
        distGone = 0;
        if(!firstArm) {
          firstArm = true;
          for(int i = 0; i < 3; i++) turn();
        } else {
          if(!secondArm) {
            secondArm = true;
            for(int i = 0; i < 5; i++) turn();
          } else {
            isDone = true;
          }
        }
      }
    }
  }
}