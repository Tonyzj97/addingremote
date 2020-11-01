import java.util.HashMap;

public class BlackjackHand extends Hand {
	
	public static HashMap<Rank, Integer> CARD_VALUES;
	public static int MAX_VALUE = 21;
	private int value;
	private int aceVal;
	
	
	static {
		CARD_VALUES = new HashMap<Rank,Integer>();
		for(Rank r : Rank.values()) {
			if( r == Rank.ACE) {
				CARD_VALUES.put(Rank.ACE, 11);		
			} else if (r == Rank.JACK) {
				CARD_VALUES.put(Rank.JACK, 10);
			} else if(r == Rank.QUEEN) {
				CARD_VALUES.put(Rank.QUEEN, 10);
			} else if(r == Rank.KING) {
				CARD_VALUES.put(Rank.KING, 10);
			} else {
				CARD_VALUES.put(r, Integer.parseInt(r.toString()));
			}			
		}
	}
	
	public BlackjackHand(Card c1, Card c2) {
		super(new Card[] {c1,c2});
		this.value =0;
		addCard(c1);
		addCard(c2);
		
		
		
		
		
	}
	
	public int getValue() {
		return value;
	}
	
	public void addCard (Card card) {
		if(this.value < MAX_VALUE) {
			if(card.getRank().equals(Rank.ACE)) {
				++aceVal;
			}
			this.value = value+ CARD_VALUES.get(card.getRank());
			if(value > MAX_VALUE) {
				if(aceVal > 0) {
					value = value - 10;
					aceVal--;
				}
			}
		}
		
	}
	@Override
	public Card playCard(int index) {
		return null;
	}
	
}
