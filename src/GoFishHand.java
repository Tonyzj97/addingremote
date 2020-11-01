
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GoFishHand extends Hand{
	
	
	HashSet<Rank> rankSet = new HashSet<Rank>();
	HashMap<Rank,Integer> rankMap = new HashMap<Rank,Integer>();
	ArrayList<Rank> rankList = new ArrayList<Rank>();
	int value = 1;
	public GoFishHand(Card[] cards) {
		super(cards);
		for(int i =0; i< cards.length; ++i) {
			 rankList.add(cards[i].getRank());
		 }
	}
		
	
	
	
	
	public HashSet<Rank> getRanks(){
		for(int i = 0; i < super.size(); i++) {
			rankSet.add(super.getCard(i).getRank());
			}
			
		
		return this.rankSet;
	}
	
	public HashMap<Rank,Integer> getRankCounts(){
		
		
			for(Rank rank : Rank.values()) {
				rankMap.put(rank, value);
				++value;
				for(Rank r : rankList) {
				if(rankMap.containsKey(r)) {
					rankMap.put(r,1);
				}
				if(!rankMap.containsKey(r)) {
					rankMap.put(rank, 0);
				}
				}
			
				
			}
			
			
		
		return rankMap;
		
	}
	
	
	

}
