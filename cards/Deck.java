public class Deck {
    private static int numberOfCards = 52;

    private static Card[] cardsInDeck = new Card[52];

    //public Deck() {
	static {
	    for(int i = 0; i < numberOfCards; i++){
		cardsInDeck[i] = new Card("jack", "diamonds");
	    }
	}
    //}

    public String showTopCard(){
	return this.cardsInDeck[0].getRank() + " of " + this.cardsInDeck[0].getSuite();
    }
}
