import java.util.HashMap;

public class BlackjackHand {
	
	public static HashMap<Rank, Integer> CARD_VALUES;
	public static int MAX_VALUE = 21;
	private int value;
	
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

}
