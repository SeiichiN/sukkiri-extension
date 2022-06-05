package v2;

import java.util.Scanner;

public class Game {
	
	public void judge(Com com, User user) {
		int userHand = user.getHand();
		int comHand = com.getHand();
		if (userHand == comHand) {
			// ひきわけ
			com.setResult("draw");
			user.setResult("draw");
		} else if ((userHand + 1) % 3 == comHand) {
			// userの勝ち
			com.setResult("lose");
			user.setResult("win");
		} else {
			// comの勝ち
			com.setResult("win");
			user.setResult("lose");
		}
	}
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com);
		System.out.println(user);
		System.out.println(convToJp(com));
	}
	public String convToJp(Com com) {
		if (com.getResult().equals("lose")) { 
			return "あなたの勝ちです。"; 
		} else if (com.getResult().equals("win")) {
			return "わたしの勝ちです。";
		} else {
			return "引き分けです。";
		}
	}
	
	public boolean isRetry() {
		System.out.print("もう一度やりますか？ (y/n) > ");
		String yesno = new Scanner(System.in).nextLine().toLowerCase();
		if (yesno.equals("y")) {
			return true;
		}
		return false;
	}
}
