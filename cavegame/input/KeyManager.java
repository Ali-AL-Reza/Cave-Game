
package dev.codenmore.cavegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyManager implements KeyListener {
//keyListener call korle 3 ta method create hoi
    private boolean[] keys;
    public boolean up,down,left,right;
    
    public KeyManager(){
        keys=new boolean[256];
    }
    public void tick(){
        up=keys[KeyEvent.VK_W];
        down=keys[KeyEvent.VK_S];
         left=keys[KeyEvent.VK_A];
          right=keys[KeyEvent.VK_D];
          System.out.println("Pressed!");
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
         keys[e.getKeyCode()]=false;
    }
    
}
