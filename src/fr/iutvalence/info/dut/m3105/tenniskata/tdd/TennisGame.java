package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private Score currentScore;
	private int serverScore;
	private int receverScore;

	public TennisGame()
	{
		this.currentScore=Score.LOVE_ALL;
		this.serverScore=0;
		this.receverScore=0;
		
	}
	 	
	public Score getScore() {
		// TODO Auto-generated method stub
		return this.currentScore;
	}
	
	public void serverHasScored()
	{
		this.serverScore= serverScore + 1;
	}
	
	public void receverHasScored()
	{
		this.receverScore= receverScore + 1;
	}
	
	

	public int getServerScore() {
		return this.serverScore;
	}
	
	public int getReceverScore() {
		return this.receverScore;
	}

	public void playerHasScored(int playerWhoScored) 
	{
		/*if(playerWhoScored == this.getServer())
		{
			this.setScore(Score.)
		}*/
	}

}
