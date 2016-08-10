public class Card {
    private String rank;
    private String suite;

    public Card(String rank, String suite){
	this.rank = rank;
	this.suite = suite;
    }

    public String getSuite() {
	return this.suite;
    }

    public String getRank() {
	return this.rank;
    }
    
}

