import java.awt.*;
import java.awt.event.*;

public class plains_C8 extends  extraFunctions {



    int direction;
    boolean flicker;


    plains_C8() {
        backgroundImage= loadImage("plains_blank_variation1.png");
        direction = 0; //< DONT CHANGE
        flicker = true; //< DONT CHANGE
    }



    @Override
    public boolean updateMapMovement(Collision collisionPoints, Character player){
        direction = collisionPoints.edgeCheck(player);
        switch (direction) {
            case 0:
                //do nothing
                break;
            case 1:
                //going up
				player.setCurrentMapLocation(4);

                flicker = false;
                return true;
            case 2:
                //going down
				player.setCurrentMapLocation(6);
                flicker = false;
                return true;
            case 3:
                // going right
                player.setCurrentMapLocation(12);
                flicker = false;
                return true;
            case 4:
                //going left
                player.setCurrentMapLocation(1);
                flicker = false;
                return true;
        }
        return false;
    }


    ////////////////////////////////////////////////////////////
    ///
    /// Collision
    ///
    ///////////////////////////////////////////////////////////
    @Override
    public void setUpCollision(Collision collisionPoints){


    }


}

