package tdd;


public class Game {

	private int score = 0;
	private int roll = 0;
	private int[] rolls = new int[21];

	public void roll(int nbQuille) {
		rolls[roll] = nbQuille;
		if (roll >= 2 && (rolls[roll - 1] + rolls[roll - 2] == 10 || roll > 2 && rolls[roll - 3] == 10)) {
			rolls[roll] += nbQuille;
		}
		if (nbQuille == 10) {
			rolls[++roll] = 0;
		}
		roll++;
	}

	public int score() {
		for (int i = 0; i < rolls.length; i++) {
			score += rolls[i];
		}
		return score;
	}
}
