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
		roll(20);
		assertEquals(0,game.score());
	}
	
	private void roll(int i) {
		for (int j = 0; j < i; j++) {
			game.roll(i);
		}
	}
}
