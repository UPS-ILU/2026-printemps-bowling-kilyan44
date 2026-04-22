package tdd;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {
	Game game;

	@BeforeEach
	void setUp() throws Exception{
		game = new Game();
	}
	
	@Test
	void iter1() {
		assertEquals(0,game.score());		
	}
	
	@Test
	void iter2( ) {
		roll(20,0);
		assertEquals(0,game.score());
	}
	
	@Test
	void iter3() {
		roll(20,1);
		assertEquals(20,game.score());
	}
	
	@Test
	void iter4() {
		roll(10,1);
		roll(10,2);
		assertEquals(30,game.score());
	}
	
	private void roll(int tour,int score ) {
		for (int j = 0; j < tour; j++) {
			game.roll(score);
		}
	}
}
