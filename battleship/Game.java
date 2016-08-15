import java.io.*;

class Game {
    Ship[] gameShips = new Ship[3];
    int shots = 0;
    boolean inProgress = true;

    public void askPlayer(){
	System.out.println("Please input your desired target.");
	try {
	BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	String inputLine = is.readLine();
	System.out.println("You fired at: " + inputLine + ".");
	} catch (IOException e) {
	    System.out.println("IOException: " + e);
	}
    }

    public void fire(){
	shots = shots + 1;
	System.out.println("You have fired " + shots + " shots.");
    }

    public void respond(){

    }

    public int getShots(){
	return shots;
    }

    public boolean getInProgress(){
	return inProgress;
    }
}
