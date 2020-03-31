package dev.codenmore.cavegame;


public class Launcher {

	public static void main(String[] args){
		Game game = new Game("Cave Game!", 640, 360);
		game.start();
	}
	
}