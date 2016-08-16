class Ship {
    private boolean status = true;
    private static int shipCounter = 0;
    private String position;
    
    public Ship(){
	System.out.println("Making new ship");
	if(shipCounter == 0){
	    this.position = "A1";
	    shipCounter++;
	} else if (shipCounter == 1){
	    this.position = "C2";
	    shipCounter++;
	} else if (shipCounter == 2){
	    this.position = "E3";
	    shipCounter++;
	}
    }

    public boolean getStatus(){
	return status;
    }

    public String getPosition(){
	return this.position;
    }
}
