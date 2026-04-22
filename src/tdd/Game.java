package tdd;

public class Game {

	private int score = 0;
	private int scoreCourant = 0;
	private int numLancer = 1;

	public void roll(int nbQuille) {
		if (numLancer % 3 == 0 && scoreCourant == 10) {
			score += nbQuille;
			scoreCourant = 0;
		}
		scoreCourant += nbQuille;
		score += nbQuille;

		numLancer++;
	}

	public int score() {
		return score;
	}
}
