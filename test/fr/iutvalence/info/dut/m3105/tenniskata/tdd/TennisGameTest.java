package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void gameStartScore()
	{
		createGameAndTestScore(Score.LOVE_ALL);
	}

	@Test
	public void serverScores()
	{
		createGameAndTestScore(Score.FIFTEEN_LOVE);
	}

	private void createGameAndTestScore(Score score) {
		TennisGame game = new TennisGame();
		assertEquals(game.getScore(), score);
	}
	
}
