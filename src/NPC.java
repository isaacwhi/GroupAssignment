import java.awt.*;

public class NPC extends extraFunctions{

    private String name; //< Name of the object
    Image sprite; //< The associated sprite
    Image spriteSheet;

    private double mapPosX; //<  NPC's map position X
    private double mapPosY; //< NPC's map position Y

    private int mapLocation; //< Npc's located Map

    private boolean hostile;

    private double height;
    private double width;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName(){
        return name;
    }

    public void setName(String x){
        this.name = x;
    }



    public int getMapLocation(){
        return mapLocation;
    }

    public void setMapLocation(int location){
        this.mapLocation = location;
    }

    public void setMapPos(double posX, double posY){
        this.mapPosX = posX;
        this.mapPosY = posY;
    }

    public double getMapPosX(){
        return mapPosX;
    }

    public double getMapPosY(){
        return mapPosY;
    }

    public void setHostile(boolean side){
        this.hostile = side;
    }

    public boolean getHostile(){
        return hostile;
    }



}

// Isaac Test Comment
