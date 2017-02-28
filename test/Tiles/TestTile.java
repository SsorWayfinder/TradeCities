package Tiles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameObjects.Road;

public class TestTile {
	private Tile tile;
	
	@Before
	public void setup(){
		tile = new Tile();
	}
	
	@Test
	public void testGetX() {
		assertEquals(0, tile.getX());
	}
	
	@Test
	public void testGetY() {
		assertEquals(0, tile.getY());
	}
	
	@Test
	public void testGetCity(){
		assertNull(tile.getCity());
	}
	
	@Test
	public void testGetRoads(){
		assertArrayEquals(new Road[8], tile.getRoads());
	}

}
