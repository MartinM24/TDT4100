package objectstructures;

public class Card implements Comparable<Card>{

	private final char suit;
	private final int face;
	
	public Card(char c, int i){
		if("SHDC".indexOf(c)==-1 || i < 1 || i > 13){
			throw new IllegalArgumentException();
		}
		suit = c;
		face = i;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public int getFace(){
		return face;
	}
	
	public String toString(){
		return suit+String.valueOf(face);
	}

	@Override
	public int compareTo(Card c) {
		return this.getFace()-c.getFace();
	}
	 
}
