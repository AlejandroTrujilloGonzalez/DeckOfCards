import java.util.Arrays;
import java.util.List;

public class Card {

	private String cardName, suit;
	
	public Card(String cardName, String suit) {
		this.cardName = cardName;
		this.suit = suit;
	}
	
	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	//Return a list of valid cards names
	public static List<String> getValidCardName(){
		
		return Arrays.asList("ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king");
	}

	//Return a list of valid cards suits
	public static List<String> getValidSuit(){
		
		return Arrays.asList("hearts", "spades", "clubs", "diamonds");
	}
	
	//Return the complete name of a card
	public String getCompleteCardName() {
		return cardName + " of " + suit;
	}
	
}
