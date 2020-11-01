import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class driver {

	public static void main(String[] args) {
		
		Card[] cards = {
				new Card(Rank.FIVE, Suit.SPADES),
				new Card(Rank.FOUR, Suit.SPADES),
				new Card(Rank.ACE, Suit.DIAMONDS),
				new Card(Rank.FOUR, Suit.DIAMONDS),
		new Card(Rank.EIGHT, Suit.HEARTS),
		new Card(Rank.FOUR, Suit.HEARTS),
		new Card(Rank.EIGHT, Suit.SPADES)};
		int value =1;
		GoFishHand hand = new GoFishHand(cards);
			
		 HashMap<Rank,Integer> rankCounts = new HashMap<Rank, Integer>();
		 ArrayList <Rank> sortedKeys = new ArrayList<Rank>();
		
			
		 for(int i =0; i< cards.length; ++i) {
			 sortedKeys.add(cards[i].getRank());
		 }
		 Collections.sort(sortedKeys);
		 for(Rank r : sortedKeys) {
			 if(!rankCounts.containsKey(r) ) {
			 rankCounts.put(r, value);
			 if(r == Rank.ACE) {
				 rankCounts.put(r, 1);
			 }
			 value++;
			 }
			 
		 }
		 
		 
		 System.out.println(sortedKeys);
		 System.out.println(rankCounts.get(Rank.FIVE));

		 System.out.println(rankCounts);
		 
		 

		
		
		
		
		
		

	}
	

}
