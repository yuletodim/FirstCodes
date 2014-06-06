import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		Pattern email = Pattern.compile("(\\w+[.-_]*\\w+)@([a-z]+[-]*[a-z]+.[a-z]+)");
		Matcher matcher = email.matcher(input);
		while(matcher.find()){
			System.out.println(matcher.group());
		}

	}

}
