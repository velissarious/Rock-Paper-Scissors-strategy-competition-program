package stefanos;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

	@Test
	public void boardTestTie() {
		Board board = new Board();
		int victor = board.run(Weapon.SCISSORS, Weapon.SCISSORS);
		assertEquals(0, victor);
		victor = board.run(Weapon.ROCK, Weapon.ROCK);
		assertEquals(0, victor);
		victor = board.run(Weapon.PAPER, Weapon.PAPER);
	}
	
	@Test
	public void boardTestVictoryPlayerA() {
		Board board = new Board();
		int victor = board.run(Weapon.SCISSORS, Weapon.PAPER);
		assertEquals(1, victor);
		victor = board.run(Weapon.ROCK, Weapon.SCISSORS);
		assertEquals(1, victor);
		victor = board.run(Weapon.PAPER, Weapon.ROCK);
		assertEquals(1, victor);
	}

}
