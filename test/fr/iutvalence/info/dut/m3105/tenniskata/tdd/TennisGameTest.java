package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void gameStartScore()
	{
		TennisGame game = new TennisGame();
		assertEquals(game.getScore(), Score.LOVE_ALL);
	}

	@Test
	public void serverScores()
	{
		TennisGame game = new TennisGame();
		//game.playerHasScored(game.getServer());
		assertEquals(game.getScore(), Score.FIFTEEN_LOVE);
	}


}
