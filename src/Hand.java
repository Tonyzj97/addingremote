import java.util.ArrayList;
import java.util.Collections;

public class Hand {
private ArrayList<Card> cards = new ArrayList<Card>();


	public Hand(Card[] cards) {
		for(Card c : cards) {
			this.cards.add(c);
		}
	}
	
	/**
	 * Return size of the hand 
	 * 
	 * @return the size of the hand
	 */
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
		ArrayList<Card> copy = new ArrayList<Card>();
		copy = (ArrayList<Card>) cards.clone();
		Collections.sort(copy);
		
		boolean val = copy.equals(cards);
		if( val == true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
