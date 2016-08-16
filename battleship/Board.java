class Board {
    // private char[] rows = {'A', 'B', 'C', 'D', 'E'};
    // private int[] columns = {1, 2, 3, 4, 5};
    Ship[] boardShips = new Ship[3];    
    private String[] positions = new String[3];
    
    public Board(Ship[] ships) {
	this.boardShips = ships;
	for (int i = 0; i < this.boardShips.length; i++){
	    this.positions [i] = this.boardShips [i].getPosition();
	}
    }

    public boolean checkShot(String lastShot){
	boolean result = false;
	for (int i = 0; i < this.boardShips.length; i++){
	    // System.out.println("ship position is " + this.boardShips [i].getPosition().hashCode());
	    // System.out.println("last shot was " + lastShot.hashCode());
	    String pos = this.boardShips [i].getPosition().trim();
	    if(this.boardShips [i].getPosition().hashCode() == lastShot.hashCode()){
		result = true;
		break;
	    } else {
		result = false;
	    }
	}
	System.out.println("Result of shot was " + result);
	return result;
    }
}
