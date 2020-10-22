
/**
 * Constants for card suits
 * 
 * @author Antony
 * @version 0.1
 *
 */

public enum Suit {
	/**
	 * 
	 * 
	 */
	
	CLUBS ("C"),
	DIAMONDS ("D"),
	HEARTS ("H"),
	SPADES ("S");
	
	private String symbol;

	private Suit(String symbol) {
		// TODO Auto-generated constructor stub
		this.symbol = symbol;
	}
	
	public String toString( ) {
		
		return symbol;
	}
	

}

