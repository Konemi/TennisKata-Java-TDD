package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public enum Score {
	
	LOVE_ALL("Love - all"),
	FIFTEEN_LOVE("fifteen - love");
	
	public String scoreEnChaine = "";
	
	private Score(String scoreEnChaine)
	{
		this.scoreEnChaine = scoreEnChaine; 
	}
	
	 public String toString()
	 {
		 return scoreEnChaine;
	 }

}
