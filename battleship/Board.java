class Board {
    private char[] rows = {'A', 'B', 'C', 'D', 'E'};
    private int[] columns = {1, 2, 3, 4, 5};
    // private int length = 3;
    // private Ship[] ships = new Ship[length];
    Ship[] boardShips = new Ship[3];    
    private String[] positions = new String[3];
    
    public Board(Ship[] ships) {
	this.boardShips = ships;
	for (int i = 0; i < this.boardShips.length; i++){
	    //positionns[i] = ships[i].getPosition();
	    System.out.println(this.boardShips [i]);
	}
    }

    public boolean checkShot(String lastShot){
	boolean hitResult = false;
	for (int i = 0; i < this.boardShips.length; i++){
	    if(this.boardShips [i].getPosition().equals(lastShot)){
		hitResult = true;
	    } else {
		hitResult = false;
	    }
	}
	return hitResult;
    }
}
