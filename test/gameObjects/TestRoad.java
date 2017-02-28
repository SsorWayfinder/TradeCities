package gameObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tiles.Tile;

public class TestRoad {
	private Road road;
	
	@Before
	public void setup(){
		road = new Road(new Tile(), new Tile());
	}

	@Test
	public void testTile1NotNull() {
		assertNotNull(road.getTile1());
	}
	
	@Test
	public void testTile2NotNull() {
		assertNotNull(road.getTile2());
	}
	
	@Test
	public void testCost(){
		assertEquals(1, road.getCost(), 0.00001);
	}
	
	@Test
	public void testUpkeep(){
		assertEquals(0.1, road.getUpkeep(), 0.00001);
	}
	
	@Test
	public void testIncome(){
		assertEquals(0, road.getIncome(), 0.00001);
	}
	
	@Test
	public void testSetCost(){
		road.setCost(2.0);
		assertEquals(2, road.getCost(), 0.00001);
	}
	
	@Test
	public void testSetUpkeep(){
		road.setUpkeep(.023);
		assertEquals(.023, road.getUpkeep(), 0.00001);
	}
	
	@Test
	public void testSetIncome(){
		road.setIncome(100);
		assertEquals(100, road.getIncome(), 0.00001);
	}
	

}
