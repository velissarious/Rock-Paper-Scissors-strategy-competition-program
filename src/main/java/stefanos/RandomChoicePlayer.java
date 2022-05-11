package stefanos;

import java.util.SplittableRandom;

public class RandomChoicePlayer implements Player {

	public Weapon choose() {
		// This player chooses randomly:
		SplittableRandom splittableRandom = new SplittableRandom();
		int randomChoice = splittableRandom.nextInt(0, 3);
		return Weapon.values()[randomChoice];
	}

}
