public class makeCard {
    public static void main(String[] args){
	Card aceOfSpades = new Card("ace", "spades");
	System.out.println("card suite is " + aceOfSpades.getSuite());

	Deck myDeck = new Deck();
	System.out.println("top card in deck is " + myDeck.showTopCard());
    }
}
