
package dev.codenmore.cavegame.states;

import dev.codenmore.cavegame.Game;
import java.awt.Graphics;


public abstract class State {
    
    private static State currentState=null;
      
    //setstate method sob static 
    public static void setState(State state){
        currentState=state;
    }
    public static State getState(){
        return currentState;
    }
    
    protected Game game;
    public State(Game game){
        this.game=game;
    }
    
    ///portek er e tick and render method thakbe
    public abstract void tick();
    
    public abstract void render (Graphics g);///amra game e graphichs g name e korsi
    /// ekhaneo g paint brush er moto kaj korbe
    
}
