import java.awt.*;
import java.awt.event.*;


public class MapControl extends extraFunctions {


    MapControl() {
        swapMap = true;
        firstMap = true;
        mapNpcs = new NPC[10];
        numOfNpc = 0;
    }


    ///////////////////////////////////
    ///
    /// Map Control
    ///
    //////////////////////////////////


    /**
     * try in to follow my format under your own Level.
     */
    boolean firstMap; //< Checks if this the first map to load when game starts
    boolean swapMap; //< checks if map should be changed

    enum Level {Forest, Plains}; //< enum to hold what level the game is on

    Level levelController = Level.Plains;  //< Change from desert to yours to get your map running

    extraFunctions currentMap; //< Holds current map data
    NPC[] mapNpcs; //< Objects to hold NPC data
    int numOfNpc; //<Number of NPC's loaded into map



    public void drawMap(Graphics g) {
        if (!firstMap) {
            drawImage(currentMap.backgroundImage, 0, 0, 800, 600, g);


            for(int i = 0; i < numOfNpc; i++) {
                drawImage(mapNpcs[0].sprite, mapNpcs[0].getMapPosX(), mapNpcs[0].getMapPosY(), mapNpcs[0].getWidth(), mapNpcs[0].getHeight(), g);
            }


        }
    }




    public void updateMap(Character playerMan, Collision collisionDetector) {

        if (!firstMap) {
            swapMap = currentMap.updateMapMovement(collisionDetector, playerMan);

        }

        if (swapMap) {
            for(int i = 0; i < 10;i++){
                mapNpcs[i] =  new npc_empty();
            }
            numOfNpc = 0;
            if (!firstMap) {
                currentMap.setUpCollision(collisionDetector);

            }
            swapMap = false;
            firstMap = false;
            if (levelController == Level.Plains) {
                switch ((int) playerMan.getCurrentMapLocation()) {
                    case 0:
                        currentMap = new plains_A9();
                        break;
                    case 1:
                        currentMap = new plains_B8();
                        break;
                    case 2:
                        currentMap = new plains_B9();
                        break;
                    case 3:
                        currentMap = new plains_B10();
                        break;
                    case 4:
                        currentMap = new plains_C7();
                        break;
                    case 5:
                        currentMap = new plains_C8();
                        break;
                    case 6:
                        currentMap = new plains_C9();
                        break;
                    case 7:
                        currentMap = new plains_C10();
                        break;
                    case 8:
                        currentMap = new plains_C11();
                        break;
                    case 10:
                        currentMap = new plains_D6();
                        break;
                    case 11:
                        currentMap = new plains_D7();
                        break;
                    case 12:
                        currentMap = new plains_D8();
                        break;
                    case 13:
                        currentMap = new plains_D9();
                        break;
                    case 14:
                        currentMap = new plains_D10();
                        break;
                    case 15:
                        currentMap = new plains_D11();
                        break;
                    case 16:
                        currentMap = new plains_D12();
                        break;
                    case 17:
                        currentMap = new plains_E5();
                        break;
                    case 18:
                        currentMap = new plains_E6();
                        break;
                    case 19:
                        currentMap = new plains_E7();
                        break;
                    case 20:
                        currentMap = new plains_E8();

                        break;
                    case 21:
                        currentMap = new plains_E9();
                        break;
                    case 22:
                        currentMap = new plains_E10();
                        break;
                    case 23:
                        currentMap = new plains_E11();
                        break;
                    case 24:
                        currentMap = new plains_E12();
                        break;
                    case 25:
                        currentMap = new plains_E13();
                        break;
                    case 26:
                        currentMap = new plains_F6();
                        break;
                    case 27:
                        currentMap = new plains_F7();
                        break;
                    case 28:
                        currentMap = new plains_F8();
                        mapNpcs[0] = new npc_plains_f8_oldman();
                        numOfNpc = 1;
                        break;
                    case 29:
                        currentMap = new plains_F9();
                        break;
                    case 30:
                        currentMap = new plains_F10();
                        break;
                    case 31:
                        currentMap = new plains_F11();
                        break;
                    case 32:
                        currentMap = new plains_F12();
                        break;
                    case 33:
                        currentMap = new plains_G7();
                        break;
                    case 34:
                        currentMap = new plains_G8();
                        break;
                    case 35:
                        currentMap = new plains_G9();
                        break;
                    case 36:
                        currentMap = new plains_G10();
                        break;
                    case 37:
                        currentMap = new plains_G11();
                        break;
                    case 38:
                        currentMap = new plains_H8();
                        break;
                    case 39:
                        currentMap = new plains_H9();
                        break;
                    case 40:
                        currentMap = new plains_H10();
                        break;
                    case 41:
                        currentMap = new plains_I9();
                        break;
                }

            } else if (levelController == Level.Forest) {
                switch ((int) playerMan.getCurrentMapLocation()) {
                    case 0:
                        currentMap = new forest_A4();
                        break;
                    case 1:
                        currentMap = new forest_A5();
                        break;
                    case 2:
                        currentMap = new forest_B3();
                        break;
                    case 3:
                        currentMap = new forest_B4();
                        break;
                    case 4:
                        currentMap = new forest_B5();
                        break;
                    case 5:
                        currentMap = new forest_B6();
                        break;
                    case 6:
                        currentMap = new forest_C2();
                        break;
                    case 7:
                        currentMap = new forest_C3();
                        break;
                    case 8:
                        currentMap = new forest_C4();
                        break;
                    case 9:
                        currentMap = new forest_C5();
                        break;
                    case 10:
                        currentMap = new forest_C6();
                        break;
                    case 11:
                        currentMap = new forest_C7();
                        break;
                    case 12:
                        currentMap = new forest_D1();
                        break;
                    case 13:
                        currentMap = new forest_D2();
                        break;
                    case 14:
                        currentMap = new forest_D3();
                        break;
                    case 15:
                        currentMap = new forest_D4();
                        break;
                    case 16:
                        currentMap = new forest_D5();
                        break;
                    case 17:
                        currentMap = new forest_D6();
                        break;
                    case 18:
                        currentMap = new forest_D7();
                        break;
                    case 19:
                        currentMap = new forest_D8();
                        break;
                    case 20:
                        currentMap = new forest_E1();
                        break;
                    case 21:
                        currentMap = new forest_E2();
                        break;
                    case 22:
                        currentMap = new forest_E3();
                        break;
                    case 23:
                        currentMap = new forest_E4();
                        break;
                    case 24:
                        currentMap = new forest_E5();
                        break;
                    case 25:
                        currentMap = new forest_E6();
                        break;
                    case 26:
                        currentMap = new forest_E7();
                        break;
                    case 27:
                        currentMap = new forest_E8();
                        break;
                    case 28:
                        currentMap = new forest_F2();
                        break;
                    case 29:
                        currentMap = new forest_F3();
                        break;
                    case 30:
                        currentMap = new forest_F4();
                        break;
                    case 31:
                        currentMap = new forest_F5();
                        break;
                    case 32:
                        currentMap = new forest_F6();
                        break;
                    case 33:
                        currentMap = new forest_F7();
                        break;
                    case 34:
                        currentMap = new forest_G3();
                        break;
                    case 35:
                        currentMap = new forest_G4();
                        break;
                    case 36:
                        currentMap = new forest_G5();
                        break;
                    case 37:
                        currentMap = new forest_G6();
                        break;
                    case 38:
                        currentMap = new forest_H4();
                        break;
                    case 39:
                        currentMap = new forest_H5();
                        break;

                }

            }
        }
        setupNPC((int) playerMan.getCurrentMapLocation());
        currentMap.setUpCollision(collisionDetector);
    }
    ///////////////////////////////////
    ///
    /// NPC Controls
    ///
    //////////////////////////////////

    public void setupNPC(int mapLocation) {
        int npcCount = 0;
        if (levelController == Level.Plains) {


        }else if (levelController == Level.Forest){

        }
    }



}

