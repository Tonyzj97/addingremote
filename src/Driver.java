import java.util.ArrayList;
import java.util.Arrays;
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
		
		int[] arr = {1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1};

		
    
			
	int [] c = arr;
	System.out.print(c);
	

	}
}
