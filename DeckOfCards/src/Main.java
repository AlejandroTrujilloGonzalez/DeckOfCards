
public class Main {

	public static void main(String[] args) {
		// Some examples
		DeckOfCards deck = new DeckOfCards();
		
		System.out.println("showing deck...");
		deck.printAllCards();
		
		System.out.println("shuffling deck...");
		deck.shuffle();
		
		System.out.println("dealing cards...");
		int deckSize = deck.getDeck().size();
		for (int i = 0; i < deckSize; i++) {
			System.out.println(deck.dealOneCard().getCompleteCardName());
		}
			
	}

}
