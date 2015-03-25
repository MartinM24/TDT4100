package objectstructures;

import java.util.ArrayList;

public class CardHand {
	
	private ArrayList<Card> cards;
	
	public CardHand(){
		cards = new ArrayList<Card>();
	}
	
	public Card getCard(int i){
		return cards.get(i);
	}
	
	public void addCard(Card card){
		cards.add(card);
	}

	public int getCardCount() {
		return cards.size();
	}

	public Card play(int i) {
		return cards.remove(i);
	}
}
