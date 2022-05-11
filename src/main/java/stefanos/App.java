package stefanos;

import java.util.Arrays;

/**
 * Rock-Paper-Scissors strategy competition program.
 *
 */
public class App {

	private static final int ROUNDS_NUMBER = 100;

	public static void main(String[] args) {

		boolean verbose = false;
		if (Arrays.asList(args).contains("-v")) {
			verbose = true;
		}

		// Create the two players:
		Player noChoicePlayer = new NoChoicePlayer();
		Player randomChoicePlayer = new RandomChoicePlayer();

		// Create the game board:
		Board board = new Board();

		System.out.println("Rock-Paper-Scissors");

		// Primary game loop:
		int victoryCountA = 0;
		int victoryCountB = 0;
		int tieCount = 0;
		for (int round = 0; round < ROUNDS_NUMBER; round++) {
			Weapon weaponPlayerA = noChoicePlayer.choose();
			Weapon weaponPlayerB = randomChoicePlayer.choose();
			int victor = board.run(weaponPlayerA, weaponPlayerB);

			if (verbose) {
				System.out.println("Player A " + weaponPlayerA + " Player B " + weaponPlayerB);
				System.out.println("Round " + round + " victor " + victor);
			}

			switch (victor) {
			case 1:
				victoryCountA++;
				break;
			case 2:
				victoryCountB++;
				break;
			default:
				tieCount++;
				break;
			}
		}

		// Display the statistics for the game:
		//@formatter:off
		System.out.println("Player A wins " + victoryCountA + " of " + ROUNDS_NUMBER + " games\n" 
				+ "Player B wins "+victoryCountB+" of "+ROUNDS_NUMBER+" games\n"
				+ "Tie: "+tieCount+" of "+ROUNDS_NUMBER+" games");
		//@formatter:on
	}
}
