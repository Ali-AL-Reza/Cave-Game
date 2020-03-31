package dev.codenmore.cavegame.worlds;

import java.awt.Graphics;

import dev.codenmore.cavegame.tiles.Tile;

public class World {

	private int width, height;
	
	private int[][] tiles;
	
	public World(String path){
            //this.game=game;
		loadWorld(path);
                
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile(x, y).render(g, x * Tile.TILEWIDTH, y * Tile.TILEHEIGHT);
			}
		}
	}
	
	public Tile getTile(int x, int y){
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.dirtTile;
		return t;
	}
	
	private void loadWorld(String path){
		
	}
	
}
