package stefanos;

public class Board {

	// Runs a round of the game and return victor number:
	public int run(Weapon weaponPlayerA, Weapon weaponPlayerB) {

		int winner;

		if (weaponPlayerA == weaponPlayerB) {
			// Tie:
			winner = 0;
		} else if (weaponPlayerA == Weapon.SCISSORS && weaponPlayerB == Weapon.PAPER
				|| weaponPlayerA == Weapon.ROCK && weaponPlayerB == Weapon.SCISSORS
				|| weaponPlayerA == Weapon.PAPER && weaponPlayerB == Weapon.ROCK) {
			// Player A wins:
			winner = 1;
		} else {
			// Player B wins:
			winner = 2;
		}

		return winner;
	}
}
