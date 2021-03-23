import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

	private ArrayList<Card> deck;

	public DeckOfCards(ArrayList<Card> deck) {
		this.deck = deck;
	}
	
	public DeckOfCards() {
		List<String> suits = Card.getValidSuit();
		List<String> cardNames = Card.getValidCardName();
		
		deck = new ArrayList<Card>();
		
		for(String suit:suits) {
			for(String cardName:cardNames) {
				deck.add(new Card(cardName, suit));
			}
		}
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	
	//Returns one card from the deck and discards it
	public Card dealOneCard() {
		if (deck.size() > 0) {
	           return deck.remove(0);
		} else {
			//deck is empty
			return null;
		}
	}
	
	//This method get the current card and a random card and swap them, shuffling the deck
	public void shuffle() {
		Random random = new Random();
		
		for (int i = 0; i < deck.size(); i++) {
		   int randomCard = random.nextInt(deck.size());	
		   Card temp = deck.get(i);
		   deck.set(i, deck.get(randomCard));
		   deck.set(randomCard, temp);
		}
	    
	}
	
	//Print all the cards of the deck in console
	public void printAllCards() {
		for(int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).getCompleteCardName());
		}
	}
}
