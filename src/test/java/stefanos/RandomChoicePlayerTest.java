package stefanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomChoicePlayerTest {

	@Test
	public void choiceShouldBeRandomTest() {
		RandomChoicePlayer randomChoicePlayer = new RandomChoicePlayer();

		final long experimentsNumber = 1000000;

		long counterRock = 0;
		long counterPaper = 0;
		long counterScissors = 0;
		Weapon chosenWeapon;

		// Run the experiment:
		for (int experiment = 0; experiment < experimentsNumber; experiment++) {
			chosenWeapon = randomChoicePlayer.choose();

			switch (chosenWeapon) {
			case ROCK:
				counterRock++;
				break;
			case PAPER:
				counterPaper++;
				break;
			default:
				counterScissors++;
				break;
			}
		}

		// Overtime the probability of all three choices should be the roughly equal:
		double expectedProbability = 1D / 3;
		double toleranceGrade = 0.01; // 2 decimal places (.0x) (+/-) 0.01

		boolean testRock = roughlyEqual(expectedProbability, (double) counterRock / experimentsNumber, toleranceGrade);
		boolean testPaper = roughlyEqual(expectedProbability, (double) counterPaper / experimentsNumber,
				toleranceGrade);
		boolean testScissors = roughlyEqual(expectedProbability, (double) counterScissors / experimentsNumber,
				toleranceGrade);
		assertEquals(true, testRock && testPaper && testScissors);
	}

	// Tolerance grade should be a double between 0 and 1:
	private static boolean roughlyEqual(double expectedValue, double actualValue, double toleranceGrade) {
		double difference = Math.abs(expectedValue - actualValue);
		double tolerance = toleranceGrade * expectedValue;
		return difference < tolerance;
	}

}
