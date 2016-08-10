public class makeCard {
    public static void main(String[] args){
	Card aceOfSpades = new Card("ace", "spades");
	//assert aceOfSpades.getSuite() == "spades";
	System.out.println("card suite is " + aceOfSpades.getSuite());
    }
}
