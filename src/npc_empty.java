public class npc_empty extends NPC {

    npc_empty(){
        setHostile(false);
        setName("");
        setMapPos(0,0);
        setMapLocation(0);
        spriteSheet = loadImage("chara2.png");
        sprite = subImage(spriteSheet,0,0,1,1);

    }

}
