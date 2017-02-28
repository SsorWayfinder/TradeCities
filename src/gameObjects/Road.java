package gameObjects;

import Tiles.Tile;

public class Road extends GameObject{
	private Tile tile1;
	private Tile tile2;

	public Road(Tile tile1, Tile tile2) {
		super(1, 0.1, 0);
		this.tile1 = tile1;
		this.tile2 = tile2;
	}

	public Tile getTile1() {
		return tile1;
	}

	public Tile getTile2() {
		return tile2;
	}

}
