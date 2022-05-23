package str_equal;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("ひとつめの文字を入力してください");
		String str1 = in.nextLine();

		System.out.println("ふたつめの文字を入力してください");
		String str2 = in.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("同じです");
		} else {
			System.out.println("違います");
		}
		in.close();
	
	}

}
