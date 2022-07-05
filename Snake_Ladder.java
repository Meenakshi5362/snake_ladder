import java.util.*;

public class Snake_Ladder{
	public static void main(String[] args) {
		int player_1=0,dice;
		Random r = new Random();
		dice=1+r.nextInt(6);
		System.out.println("Player_1 rolls a dice of "+dice);
	}
}