import java.util.*;

public class Snake_Ladder {
	public static void main(String[] args) {
		int player_1 = 0, dice;
		String choice;
		Random r = new Random();
		while (true) {
			dice = 1 + r.nextInt(6);
			System.out.println("Player_1 rolls a dice of " + dice);
			String option[] = { "No_Play", "Ladder", "Snake" };
			choice = option[r.nextInt(3)];
			System.out.println(choice);

			if (choice == ("Ladder")) {
				player_1 = player_1 + dice;
				System.out.println(player_1);
			} 
			else if (choice == ("Snake")) {
				player_1 = player_1 - dice;
						if (player_1 < 0) {
					player_1 = 0;
				}
				System.out.println(player_1);
			} 
			else {
				System.out.println("No_Play condition occures");
			}
			if (player_1 >= 100)
			{
				System.out.println("game ended");
			break;	
			}
		}
	}
}
