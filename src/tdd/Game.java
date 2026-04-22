package tdd;

public class Game {

	private int[] rolls = new int[21];
	private int roll = 0;

	public void roll(int nbQuille) {
		rolls[roll++] = nbQuille;
	}

	public int score() {
		int score = 0;
		int i = 0;

		for (int frame = 0; frame < 10; frame++) {

			// STRIKE
			if (rolls[i] == 10) {
				score += 10 + rolls[i + 1] + rolls[i + 2];
				i += 1;
			}

			// SPARE
			else if (rolls[i] + rolls[i + 1] == 10) {
				score += 10 + rolls[i + 2];
				i += 2;
			}

			// NORMAL
			else {
				score += rolls[i] + rolls[i + 1];
				i += 2;
			}
		}

		return score;
	}
}