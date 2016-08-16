import java.io.*;

class Game {
    Ship[] gameShips = new Ship[3];
    Board board = new Board(gameShips);
    int shots = 0;
    String lastShot;
    boolean inProgress = true;

    public Game() {
	for(int i = 0; i < gameShips.length; i++){
	    gameShips[i] = new Ship();
	}
    }

    public void askPlayer(){
	System.out.println("Please input your desired target.");
	try {
	    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	    String inputLine = is.readLine();
	    this.fire(inputLine);
	    System.out.println("You fired at: " + inputLine + ".");
	} catch (IOException e) {
	    System.out.println("IOException: " + e);
	}
    }

    public void fire(String target){
	shots = shots + 1;
	this.setLastShot(target);
	System.out.println("You have fired " + shots + " shots.");
    }

    private String setLastShot(String target){
	return this.lastShot = target;
    }

    public void respond(){
	boolean hit = board.checkShot(lastShot);
	if (hit){
	    System.out.println("You hit!");
	} else {
	    System.out.println("You missed.");
	}
    }

    public int getShots(){
	return shots;
    }

    public boolean getInProgress(){
	return inProgress;
    }
}
