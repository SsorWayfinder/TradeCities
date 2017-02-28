package gameObjects;

import Tiles.Tile;

public class City extends GameObject {
	private Tile tile;

	public City( Tile tile) {
		super(10, 0, 1);
		// TODO Auto-generated constructor stub
	}

	public Tile getTile() {
		return tile;
	}

	
}
