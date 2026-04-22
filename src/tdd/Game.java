package tdd;

public class Game {

	private int score = 0;
	
	public void roll(int nbQuille) {
		score += nbQuille;
	}
	
	public int score() {
		return score;
	}
}
