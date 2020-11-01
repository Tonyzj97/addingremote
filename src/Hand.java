import java.util.ArrayList;
import java.util.Collections;

public class Hand {
private ArrayList<Card> cards = new ArrayList<Card>();


	public Hand(Card[] cards) {
		for(Card c : cards) {
			this.cards.add(c);
		}
	}
	
	
	
	public int size() {
		
		return cards.size();
	}
	
	public Card getCard(int index) {
		
		return cards.get(index);
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card playCard (int index) {
		
		if(cards.size() > 0) {
		
		Card removed = cards.get(index);
		cards.remove(index);
		
		return removed;
		}
		
		else {
			return null;
		}
	}
	
	public String toString() {
		
		return cards.toString();
	}
	
	public void sort( ) {
		Collections.sort(cards);
	}
	
	public boolean isSorted() {
		
		for(int i = 1; i < cards.size(); ++i) {
			if(cards.get(i-1).compareTo(cards.get(i)) > 0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	

}
