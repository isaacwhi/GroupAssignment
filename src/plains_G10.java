import java.awt.*;
import java.awt.event.*;

public class plains_G10 extends  extraFunctions {



    int direction;
    boolean flicker;


    plains_G10() {
        backgroundImage= loadImage("plains_blank_variation3.png");
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
                player.setCurrentMapLocation(35);
                flicker = false;
                return true;
            case 2:
                //going down
                player.setCurrentMapLocation(37);
                flicker = false;
                return true;
            case 3:
                // going right
                player.setCurrentMapLocation(40);
                flicker = false;
                return true;
            case 4:
                //going left
                player.setCurrentMapLocation(30);
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

