class Board {
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
	    Ship currentShip = this.boardShips [i];
	    if(currentShip.getPosition().hashCode() == lastShot.hashCode()){
		result = true;
		currentShip.destroy();
		break;
	    } else {
		result = false;
	    }
	}
	return result;
    }
}
