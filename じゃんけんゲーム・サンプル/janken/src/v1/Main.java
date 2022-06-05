package v1;

public class Main {

	public static void main(String[] args) {
		String userName = "";
		if (args.length == 1) {
			userName = args[0];
		} else {
			userName = "才蔵";
		}
		
		String[] hand = {"グー", "チョキ", "パー"};
		int com = new java.util.Random().nextInt(3);
		
		int user = userInput();
		
		System.out.println("わたしの手は" + hand[com] + "です");
		System.out.println(userName + "の手は" + hand[user] + "です");
		
		hantei(com, user, userName);
	}
	
	public static void hantei(int com, int user, String name) {
		if (com == user) {
			System.out.println("ひきわけです");
		} else if (user == 0 && com == 1 ||
				   user == 1 && com == 2 ||
				   user == 2 && com == 0) {
			System.out.println(name + "の勝ちです");
		} else {
			System.out.println("わたしの勝ちです");
		}
	}
	
	public static int userInput() {
		System.out.println("0:グー 1:チョキ 2:パー");
		System.out.print("数字で入力してください > ");
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}

}
