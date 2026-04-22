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
	
	@Test
	void iter5() {
		roll(1,7);
		roll(1,3);
		roll(1,4);
		roll(17,0);
		assertEquals(18,game.score());
	}
	
	@Test
	void iter6() {
		roll(1,10);
		roll(1,3);
		roll(1,4);
		roll(16,0);
		assertEquals(24,game.score());
	}
	
	@Test
	public void casGeneral() {
		roll(1,1);
		roll(1,2); 
		roll(1,10);
		roll(1,0);
		roll(1,10);
		roll(1,4);
		roll(1,2);
		roll(1,0);
		roll(1,10);
		roll(1,6);
		roll(1,2);
		roll(1,0);
		roll(1,10);
		roll(1,6);
		roll(1,4);
		roll(1,8);
		roll(1,2);
		roll(1,2);
		roll(1,7);
		assertEquals(122, game.score());
	}
	
	@Test
	public void casExtension() {
		roll(1,1);
		roll(1,2); 
		roll(1,10);
		roll(1,0);
		roll(1,10);
		roll(1,4);
		roll(1,2);
		roll(1,0);
		roll(1,10);
		roll(1,6);
		roll(1,2);
		roll(1,0);
		roll(1,10);
		roll(1,6);
		roll(1,4);
		roll(1,8);
		roll(1,2);
		roll(1,2);
		roll(1,8);
		roll(1,8);
		assertEquals(131, game.score());
	}
	
	@Test
	public void casGenie() {
		roll(12,10);
		assertEquals(300, game.score());
	}
	
	
	private void roll(int tour,int score ) {
		for (int j = 0; j < tour; j++) {
			game.roll(score);
		}
	}
}
