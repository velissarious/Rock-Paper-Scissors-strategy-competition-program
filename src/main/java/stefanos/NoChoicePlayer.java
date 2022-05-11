package stefanos;

public class NoChoicePlayer implements Player {

	public Weapon choose() {
		// This player always chooses Paper:
		return Weapon.PAPER;
	}

}
