package battleGame;

import java.util.Random;

public class Game {

	private Player player1;
	private Player player2;
	
	public Game(int hpPlayer1, int hpPlayer2) {
		player1 = new Player(hpPlayer1);
		player2 = new Player(hpPlayer2);
		play();
	}
	
	private void attack(int number, Player player) {
		Random rand = new Random();
		player.setHpPlayer(player.getHpPlayer() - rand.nextInt(number) + 0);
	}

	private void play() {
		int i = 1;

		while (player1.getHpPlayer() > 0 && player2.getHpPlayer() > 0) {
			System.out.println("Round: " + i);
			attack(10, player1);
			attack(5, player2);
			System.out.println("The remaining HP of player 1 is: " + player1.getHpPlayer());
			System.out.println("The remaining HP of player 2 is: " + player2.getHpPlayer());
			i++;
		}

		if ((player1.getHpPlayer() < 0 && player2.getHpPlayer() < 0) || (player1.getHpPlayer() == 0 && player2.getHpPlayer() == 0)) {
			System.out.println("DRAW!");
		} else if (player1.getHpPlayer() > player2.getHpPlayer()) {
			System.out.println("And the winner is: Player 1");
		} else {
			System.out.println("And the winner is: Player 2");
		}
	}

}

