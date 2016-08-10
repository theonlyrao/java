public class Deck {
    private static int numberOfCards = 52;

    private Card[] cardsInDeck = new Card[numberOfCards];

    public Deck(String type) {
	if ("jacks".equals(type)) {
	    for(int i = 0; i < numberOfCards; i++){
		cardsInDeck[i] = new Card("jack", "diamonds");
	    }
	} else {
	    for(int i = 0; i < numberOfCards; i++){
		cardsInDeck[i] = new Card("ace", "spades");
	    }
	}
    }

    public String showTopCard(){
	return this.cardsInDeck[0].getRank() + " of " + this.cardsInDeck[0].getSuite();
    }
}
