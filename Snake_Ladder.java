import java.util.*;

public class Snake_Ladder {
	public static void main(String[] args) {
		int player_1 = 0, dice, count1 = 0, player_2 = 0, count2 = 0;
		String choice;
		Random r = new Random();
		while (true) {
			dice = 1 + r.nextInt(6);
			System.out.println("Player_1 rolls a dice of " + dice);
			String option[] = { "No_Play", "Ladder", "Snake" };
			choice = option[r.nextInt(3)];
			System.out.println(choice);

			if (choice == ("Ladder")) {
				if (player_1 + dice <= 100) {
					player_1 = player_1 + dice;

				} else {
					System.out.println("position exceeds 100");
				}

			} else if (choice == ("Snake")) {
				player_1 = player_1 - dice;
				if (player_1 < 0) {
					player_1 = 0;
				}
				System.out.println(player_1);
			} else {
				System.out.println("No_Play condition occures");
			}
			if (player_1 == 100) {
				System.out.println("player 1 wins ");
				break;
			}
			count1++;
			System.out.println("Position of player1 after every dice role " + player_1);
			dice = 1 + r.nextInt(6);
			System.out.println("Player_2 rolls a dice of " + dice);
			// String option[] = { "No_Play", "Ladder", "Snake" };
			choice = option[r.nextInt(3)];
			System.out.println(choice);

			if (choice == ("Ladder")) {
				if (player_2 + dice <= 100) {
					player_2 = player_2 + dice;

				} else {
					System.out.println("position exceeds 100");
				}

			} else if (choice == ("Snake")) {
				player_2 = player_2 - dice;
				if (player_2 < 0) {
					player_2 = 0;
				}
				System.out.println(player_2);
			} else {
				System.out.println("No_Play condition occures");
			}
			if (player_2 == 100) {
				System.out.println("player 2 wins");
				break;
			}
			count2++;
			System.out.println("Position of player2 after every dice role " + player_2);

		}
		System.out.println("No of times dice was played by player1 :" + count1);
		System.out.println("No of times dice was played by player2 :" + count2);
	}
}
