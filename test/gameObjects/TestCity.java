package gameObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tiles.Tile;

public class TestCity {
	private City city;

	@Before
	public void setUp(){
		city = new City(new Tile());
	}

	@Test
	public void testCost(){
		assertEquals(10, city.getCost(), 0.00001);
	}
	
	@Test
	public void testUpkeep(){
		assertEquals(0.0, city.getUpkeep(), 0.00001);
	}
	
	@Test
	public void testIncome(){
		assertEquals(1, city.getIncome(), 0.00001);
	}
	
	@Test
	public void testSetCost(){
		city.setCost(2.0);
		assertEquals(2, city.getCost(), 0.00001);
	}
	
	@Test
	public void testSetUpkeep(){
		city.setUpkeep(.023);
		assertEquals(.023, city.getUpkeep(), 0.00001);
	}
	
	@Test
	public void testSetIncome(){
		city.setIncome(100);
		assertEquals(100, city.getIncome(), 0.00001);
	}
	
	@Test
	public void testGetTile(){
		assertNotNull(city.getTile());
	}

}
