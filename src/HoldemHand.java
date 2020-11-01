
public class HoldemHand extends Hand {
	
	
	public HoldemHand (Card c1, Card c2) {
		super(new Card[] {c1,c2});
	}
	
	public boolean hasFlush(Card [] community) {
		return false;
	}
	public Card playCard(int index) {
		return null;
	}
	public void addCard(Card card) {
		
	}

}
