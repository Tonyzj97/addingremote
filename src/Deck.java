import java.util.Collections;
import java.util.LinkedList;

public class Deck {
	
	private LinkedList<Card> cards = new LinkedList<Card>();
	
	public Deck() {
		Card card;
		
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				card = new Card (r,s);
				cards.add(card);
			}
		}
	}
	
	public Deck (Card [] cards) {
		for(Card card : cards) {
			this.cards.add(card);
		}
		
	}
	
	public Deck (Deck deck) {
		LinkedList<Card> copy = new LinkedList<Card>();
		copy = (LinkedList<Card>) deck.cards.clone();
		
		cards = (LinkedList<Card>) deck.cards.clone();
	}
	
	public Card draw() {
		if(cards.size() > 0) {
		Card removed = cards.remove(0);
		return removed;
		}
		
	return null;
	
	}
	
	public int size() {
		return cards.size();
	}
	public String toString() {
		return cards.toString();
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}

}
