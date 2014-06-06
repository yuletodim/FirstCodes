import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] inputText = scan.nextLine().split("[ , . ! ? : ; ( ) ... ' \" -]+");
		System.out.println(inputText.length);
	}

}
