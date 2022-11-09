package stefanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoChoicePlayerTest {

	@Test
	public void shouldChooseOnlyPaper() {
		int expectedCount = 1000;
		Player noChoicePlayer = new NoChoicePlayer();

		int count = 0;
		for (int i = 0; i < expectedCount; i++) {
			if (noChoicePlayer.choose() == Weapon.PAPER) {
				count++;
			}
		}

		assertEquals(expectedCount, count);
	}

}
