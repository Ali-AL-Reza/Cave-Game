
package dev.codenmore.cavegame.entities;

import java.awt.Graphics;


public abstract class Entity {
    //protected Game game;
    protected float x,y;///private er moto 
    protected int width ,height;
    
    
    public Entity(float x ,float y,int width,int height){
        //this.game=game;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    
    
     public abstract void tick();
    
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
   
}
