package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public enum Score {
	
	LOVE_ALL("Love - all", "00"),
	FIFTEEN_LOVE("fifteen - love", "10"),
	THIRSTY_LOVE("thirsty - love", "10"),
	FOURTY_LOVE("fourty - love", "10"),
	LOVE_FIFTEEN("love - fifteen", "10"),
	LOVE_THIRSTY("love - thirsty", "10"),
	LOVE_FOURTY("love - fourty", "10"),
	FIFTEEN_ALL("fifteen - all", "10"),
	THIRSTY_ALL("thirsty - all", "10"),
	FOURTY_ALL("fourty - all", "10");
	
	private String scoreEnChaine = "";
	
	private Score(String scoreEnChaine, String scoreIntEnChaine)
	{
		this.scoreEnChaine = scoreEnChaine;		
	}
	
	
	 public String getScoreEnChaine() {
		return scoreEnChaine;
	}


	public void setScoreEnChaine(String scoreEnChaine) {
		this.scoreEnChaine = scoreEnChaine;
	}


	public String toString()
	 {
		 return scoreEnChaine;
	 }

}
