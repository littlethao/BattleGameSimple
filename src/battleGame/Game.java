package battleGame;

import java.util.Random;

public class Game {

	public static int health_of_player1 = 50;
	public static int health_of_player2 = 25;

	public static int getFirstPlayerHP() {
		return health_of_player1;
	}

	public static int getSecondPlayerHP() {
		return health_of_player2;
	}

	public static int attack(int number) {
		Random rand = new Random();
		return rand.nextInt(number) + 0;
	}

	public static void attackPlayer1() {
		health_of_player1 -= attack(10);
	}

	public static void attackPlayer2() {
		health_of_player2 -= attack(5);
	}

	public static void main(String[] args) {
		int i = 1;

		while (health_of_player1 > 0 && health_of_player2 > 0) {
			System.out.println("Round: " + i);
			attackPlayer1();
			attackPlayer2();
			System.out.println("The remaining HP of player 1 is: " + health_of_player1);
			System.out.println("The remaining HP of player 2 is: " + health_of_player2);
			i++;
		}

		if (health_of_player1 > health_of_player2) {
			System.out.println("And the winner is: Player 1");
		} else {
			System.out.println("And the winner is: Player 2");
		}
	}

}

