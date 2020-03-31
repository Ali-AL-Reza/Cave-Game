
package dev.codenmore.cavegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Tile {
    
    //static varibable sob jaiga theke access korbo
    public static Tile[] tiles=new Tile[256];
    public static Tile grassTile=new GrassTile(0);///id dici 0
    public static Tile dirtTile=new DirtTile(1);
    public static Tile rockTile=new RockTile(2);
    
    
    
    public static final int TILEWIDTH=64,TILEHEIGHT=64;
    
    protected BufferedImage texture;
    protected final int id;///final korlam karon tile er position to change hobe na
    
    
    public Tile(BufferedImage texture,int id){
        this.texture=texture;
        this.id=id;
        
        tiles[id]=this;
    }
    
   ///update er jonno tick end render method
    public void tick(){
        
    }
    
    public void render(Graphics g,int x,int y){
        g.drawImage(texture,x, y,TILEWIDTH,TILEHEIGHT, null);
        
    }
    
    public boolean isSolid(){
        return false;
    }
    
    ///geter
   
    public int getId(){
        return id;
    }
    
}
