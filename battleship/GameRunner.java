class GameRunner {
    public static void main(String[] args) {
	Game game = new Game();
	while(game.getInProgress()){
	    game.askPlayer();
	    game.respond();
	}
	System.out.println("Game over after " + game.getShots() + " shots.");
    };
}
