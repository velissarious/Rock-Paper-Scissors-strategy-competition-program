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
		final int expectedVictor = 1;
		int victor = board.run(Weapon.SCISSORS, Weapon.PAPER);
		assertEquals(expectedVictor, victor);
		victor = board.run(Weapon.ROCK, Weapon.SCISSORS);
		assertEquals(expectedVictor, victor);
		victor = board.run(Weapon.PAPER, Weapon.ROCK);
		assertEquals(expectedVictor, victor);
	}
	
	@Test
	public void boardTestVictoryPlayerB() {
		Board board = new Board();
		final int expectedVictor = 2;
		int victor = board.run(Weapon.PAPER, Weapon.SCISSORS);
		assertEquals(expectedVictor, victor);
		victor = board.run(Weapon.SCISSORS, Weapon.ROCK);
		assertEquals(expectedVictor, victor);
		victor = board.run(Weapon.ROCK, Weapon.PAPER);
		assertEquals(expectedVictor, victor);
	}

}
