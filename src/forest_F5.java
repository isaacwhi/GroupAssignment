
public class forest_F5 extends extraFunctions {
    int direction;
    boolean flicker;

    forest_F5() {
        backgroundImage = loadImage("forest_F5.png");
        direction = 0; //< DONT CHANGE
        flicker = true; //< DONT CHANGE
    }
    @Override
    public boolean updateMapMovement(Collision collisionPoints, Character player) {
        direction = collisionPoints.edgeCheck(player);
        switch (direction) {
            case 0:
                //do nothing
                return true;
            case 1:
                player.setCurrentMapLocation(30);
                flicker = false;
                return true;

            case 2:
                player.setCurrentMapLocation(32);
                flicker = false;
                return true;

            case 3:
                // going right
                player.setCurrentMapLocation(36);
                flicker = false;
                return true;

            case 4:
                player.setCurrentMapLocation(24);
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
    public void setUpCollision(Collision collisionPoints) {

    }
}