
public class Card implements Comparable <Card> {
	
	private Rank rank;
	private Suit suit;
	
	public Card (Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public String toString() {
		
		return (rank.toString().concat(suit.toString()));
	}

	@Override
	public int compareTo(Card other) {
		// TODO Auto-generated method stub
		int value = this.getSuit().compareTo(other.getSuit());
		
		if(value == 0) {
			value = this.getRank().compareTo(other.getRank());
		}
		
		return value;
	}

}
