package stefanos;

import java.util.SplittableRandom;

public class RandomChoicePlayer implements Player {

	// Store the weapon enumeration as array once to avoid doing in multiple times
	// for performance reasons.
	private Weapon[] weaponArray;

	public RandomChoicePlayer() {
		this.weaponArray = Weapon.values();
	}

	public Weapon choose() {
		// This player chooses randomly:
		SplittableRandom splittableRandom = new SplittableRandom();
		int randomChoice = splittableRandom.nextInt(0, 3);
		return this.weaponArray[randomChoice];
	}

}
