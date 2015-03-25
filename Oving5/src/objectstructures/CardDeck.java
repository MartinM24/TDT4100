package objectstructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	private List<Card> cards = new ArrayList<Card>();
	public CardDeck(int n){
		String suits = "SHDC";
		for(int k = 0; k < suits.length() ; k++){
			for (int i = 0; i < n; i++) {
				cards.add(new Card(suits.charAt(k),i+1));
			}
			
		}
	}
	
	public int getCardCount(){
		return cards.size();
	}
	
	public Card getCard(int n){
		if (n<0 || n> cards.size()){
			throw new IllegalArgumentException();
		}
		return cards.get(n);
	}

	public void deal(CardHand hand, int n){
		if(n > getCardCount()){
			throw new IllegalArgumentException();
		}
		for(int i = 0 ; i < n ; i++){
			hand.addCard(cards.remove(getCardCount()-1));
		}
	}
	
	public void shufflePerfectly(){
		ArrayList<Card> a = new ArrayList<Card>();
		ArrayList<Card> b = new ArrayList<Card>();
		int split = getCardCount()/2;
		for(int i = 0 ; i < getCardCount();i++){
			if (i<split){
				a.add(getCard(i));
			}
			else{
				b.add(getCard(i));
			}
		}
		ArrayList<Card> c = new ArrayList<Card>();
		while(!a.isEmpty()){
			c.add(a.remove(0));
			c.add(b.remove(0));
		}
		if(!b.isEmpty()){
			c.add(b.get(0));
		}
		cards = c;
	}
		
	public void shufflePerfectly2(){
		ArrayList<Card> a = new ArrayList<Card>();
		ArrayList<Card> b = new ArrayList<Card>();
		int split = getCardCount()/2;
		for(int i = 0 ; i < getCardCount();i++){
			if (i<split){
				a.add(getCard(i));
			}
			else{
				b.add(getCard(i));
			}
		}
		Collections.sort(a);
		Collections.sort(b);
		ArrayList<Card> c = new ArrayList<Card>();
		for(Card card:a){
			c.add(card);
		}
		for(Card card:b){
			c.add(card);
		}
		cards = c;
	}
	
	
	/*

shufflePerfectly() - stokker kortstokken ved � dele den i to like store deler og flette de to delene perfekt, slik at kortet p� toppen forblir p� toppen og kortet p� bunnen forblir p� bunnen (se http://en.wikipedia.org/wiki/Out_shuffle)
	 */
}