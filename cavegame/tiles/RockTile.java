
package dev.codenmore.cavegame.tiles;

import dev.codenmore.cavegame.gfx.Assets;


public class RockTile extends Tile {

    public RockTile( int id) {
        super(Assets.stone, id);
    }

    ///override
   
    @Override
    public boolean isSolid(){
        return true;
    }
}
