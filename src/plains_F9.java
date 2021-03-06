import java.awt.*;
import java.awt.event.*;

public class plains_F9 extends  extraFunctions {



    int direction;
    boolean flicker;


    plains_F9() {
        backgroundImage= loadImage("plains_F9.png");
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
                player.setCurrentMapLocation(28);
                flicker = false;
                return true;
            case 2:
                //going down
                player.setCurrentMapLocation(30);
                flicker = false;
                return true;
            case 3:
                // going right
                player.setCurrentMapLocation(35);
                flicker = false;
                return true;
            case 4:
                //going left
                player.setCurrentMapLocation(21);
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


        for (int i = 53;i <= 63; i++){
            collisionPoints.addSmallCollisionPoint(i,21,flicker);
        }

        for (int i = 7;i <= 21; i++){
            collisionPoints.addSmallCollisionPoint(53,i,flicker);
        }
        for (int i = 7;i <= 21; i++){
            collisionPoints.addSmallCollisionPoint(64,i,flicker);
        }
        collisionPoints.addSmallCollisionPoint(54,6,flicker);
        collisionPoints.addSmallCollisionPoint(55,5,flicker);
        collisionPoints.addSmallCollisionPoint(56,4,flicker);
        collisionPoints.addSmallCollisionPoint(57,4,flicker);
        collisionPoints.addSmallCollisionPoint(57,3,flicker);
        collisionPoints.addSmallCollisionPoint(58,4,flicker);
        collisionPoints.addSmallCollisionPoint(58,2,flicker);
        collisionPoints.addSmallCollisionPoint(59,2,flicker);
        collisionPoints.addSmallCollisionPoint(59,4,flicker);
        collisionPoints.addSmallCollisionPoint(60,3,flicker);
        collisionPoints.addSmallCollisionPoint(60,4,flicker);
        collisionPoints.addSmallCollisionPoint(61,5,flicker);
        collisionPoints.addSmallCollisionPoint(62,6,flicker);
        collisionPoints.addSmallCollisionPoint(36,29,flicker);
        collisionPoints.addSmallCollisionPoint(63,7,flicker);






        //Fence
        for(int i = 65; i <= 73; i++) {
            collisionPoints.addSmallCollisionPoint(i, 20, flicker);
        }
        for(int i = 63; i <= 73; i++) {
            collisionPoints.addSmallCollisionPoint(i, 5, flicker);
        }
        for(int i = 20; i >= 5; i--) {
            collisionPoints.addSmallCollisionPoint(73, i, flicker);
        }

        //pier
        for(int i = 1;i <= 27;i++){
            collisionPoints.addSmallCollisionPoint(i,15,flicker);
        }
        for(int i = 1;i <= 27;i++){
            collisionPoints.addSmallCollisionPoint(i,9,flicker);
        }

        // big house left
        for(int i = 28; i <= 43;i++){
            collisionPoints.addSmallCollisionPoint(2,i,flicker);
        }
        for(int i = 28; i <= 43;i++){
            collisionPoints.addSmallCollisionPoint(17,i,flicker);
        }
        for(int i = 2; i < 17;i++){
            collisionPoints.addSmallCollisionPoint(i,43,flicker);
            collisionPoints.addSmallCollisionPoint(i,28,flicker);
        }
        for(int i = 5; i < 13;i++){
            collisionPoints.addSmallCollisionPoint(i,26,flicker);
        }
        for(int i = 7; i < 11;i++){
            collisionPoints.addSmallCollisionPoint(i,25,flicker);
        }
        collisionPoints.addSmallCollisionPoint(14,27,flicker);
        collisionPoints.addSmallCollisionPoint(15,27,flicker);

        //big house right

        for(int i = 28; i <= 43;i++){
            collisionPoints.addSmallCollisionPoint(21,i,flicker);
        }
        for(int i = 28; i <= 43;i++){
            collisionPoints.addSmallCollisionPoint(37,i,flicker);
        }

        for(int i = 21; i < 38;i++){
            collisionPoints.addSmallCollisionPoint(i,30,flicker);
            collisionPoints.addSmallCollisionPoint(i,43,flicker);
        }
        for(int i = 23; i < 35;i++){
            collisionPoints.addSmallCollisionPoint(i,27,flicker);
        }
        for(int i = 27; i < 32;i++){
            collisionPoints.addSmallCollisionPoint(i,26,flicker);
        }
        collisionPoints.addSmallCollisionPoint(29,25,flicker);
        collisionPoints.addSmallCollisionPoint(30,25,flicker);
        collisionPoints.addSmallCollisionPoint(28,25,flicker);
        collisionPoints.addSmallCollisionPoint(31,25,flicker);
        collisionPoints.addSmallCollisionPoint(35,28,flicker);
        collisionPoints.addSmallCollisionPoint(34,28,flicker);
        collisionPoints.addSmallCollisionPoint(22,28,flicker);
        collisionPoints.addSmallCollisionPoint(23,28,flicker);

    //Lake
        for(int i = 26,j = 8;i > 18;i--,j--){
            collisionPoints.addSmallCollisionPoint(i,j,flicker);
            collisionPoints.addSmallCollisionPoint(i,j-1,flicker);
        }


        for(int i = 15,j = 26;i  < 25;i++,j--){
            collisionPoints.addSmallCollisionPoint(i,j,flicker);
            collisionPoints.addSmallCollisionPoint(i+1,j,flicker);
        }

        collisionPoints.addCollisionPoint(96,flicker);
        //EXTRA DETAILS
            //Box
        collisionPoints.addSmallCollisionPoint(40,41,flicker);
        collisionPoints.addSmallCollisionPoint(39,41,flicker);
        collisionPoints.addSmallCollisionPoint(38,41,flicker);
        collisionPoints.addSmallCollisionPoint(40,40,flicker);
        collisionPoints.addSmallCollisionPoint(39,40,flicker);
        collisionPoints.addSmallCollisionPoint(38,40,flicker);
        collisionPoints.addSmallCollisionPoint(40,39,flicker);
        collisionPoints.addSmallCollisionPoint(39,39,flicker);
        collisionPoints.addSmallCollisionPoint(38,39,flicker);

        //Sign
        collisionPoints.addSmallCollisionPoint(61,22,flicker);
        collisionPoints.addSmallCollisionPoint(62,22,flicker);
        collisionPoints.addSmallCollisionPoint(63,22,flicker);
        collisionPoints.addSmallCollisionPoint(64,22,flicker);

        //WoodPiles
        collisionPoints.addSmallCollisionPoint(2,44,flicker);
        collisionPoints.addSmallCollisionPoint(2,45,flicker);
        collisionPoints.addSmallCollisionPoint(3,45,flicker);
        collisionPoints.addSmallCollisionPoint(3,44,flicker);

        for(int i = 7; i <= 12; i++) {
            collisionPoints.addSmallCollisionPoint(i, 44, flicker);
            collisionPoints.addSmallCollisionPoint(i, 45, flicker);
        }
        //Tree Stump
        collisionPoints.addSmallCollisionPoint(49,49,flicker);
        collisionPoints.addSmallCollisionPoint(48,48,flicker);
        collisionPoints.addSmallCollisionPoint(48,48,flicker);
        collisionPoints.addSmallCollisionPoint(47,48,flicker);
        collisionPoints.addSmallCollisionPoint(47,48,flicker);
        collisionPoints.addSmallCollisionPoint(48,47,flicker);
        collisionPoints.addSmallCollisionPoint(48,47,flicker);
        collisionPoints.addSmallCollisionPoint(48,46,flicker);
        collisionPoints.addSmallCollisionPoint(49,46,flicker);
        collisionPoints.addSmallCollisionPoint(50,46,flicker);
        collisionPoints.addSmallCollisionPoint(50,46,flicker);
        collisionPoints.addSmallCollisionPoint(51,46,flicker);
        collisionPoints.addSmallCollisionPoint(51,47,flicker);
        collisionPoints.addSmallCollisionPoint(51,48,flicker);
        collisionPoints.addSmallCollisionPoint(51,48,flicker);
        collisionPoints.addSmallCollisionPoint(51,49,flicker);
        collisionPoints.addSmallCollisionPoint(50,49,flicker);
    }


}

