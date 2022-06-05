package v2;

import java.util.Scanner;

public class InputNextHand implements NextHand {
	public int decideHand() {
		System.out.println("手を選択してください。");
		System.out.println("0:グー 1:ちょき 2:パー");
		System.out.print(">");
		@SuppressWarnings("resource")
		int hand = new Scanner(System.in).nextInt();
		return hand;
	}

}
