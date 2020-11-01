
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GoFishHand extends Hand{
	
	
	HashSet<Rank> rankSet = new HashSet<Rank>();
	HashMap<Rank,Integer> map = new HashMap<Rank,Integer>();

	
	public GoFishHand(Card[] cards) {
		super(cards);
		

	    

	   
	}
		
	
	
	
	
	public HashSet<Rank> getRanks(){
		for(int i = 0; i < super.size(); i++) {
			rankSet.add(super.getCard(i).getRank());
			}
			
		
		return this.rankSet;
	}
	
	public HashMap<Rank,Integer> getRankCounts(){
		
		
			for(Rank rank : Rank.values()) {
				map.put(rank, 0);
			}
			for (int i = 0; i < super.size(); i++) 
	        { 
	            if (map.containsKey(super.getCard(i).getRank()))  
	            { 
	                map.put(super.getCard(i).getRank(), map.get(super.getCard(i).getRank()) + 1); 
	            }  
	            else
	            { 
	                map.put(super.getCard(i).getRank(), 1); 
	            } 
	        } 
				
				
				
			
				
			
			
			
		
		return map;
		
	}
	
	
}
