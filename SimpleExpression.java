import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This code reads a string, separates all the numbers and the signes +/- beetwen them
// and calculates the expression

public class SimpleExpression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ArrayList<String> nums = new ArrayList<>();
		ArrayList<String> findSign = new ArrayList<>();
		
		
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '+' || input.charAt(i) == '-'){
				String s = "" + input.charAt(i);
				findSign.add(s);
			}
		}
		
		Pattern numPat = Pattern.compile("([0-9]+)[.]*([0-9]+)*");
		Matcher match = numPat.matcher(input);
		while(match.find()){
			nums.add(match.group());
		}
		
		Double[] nums2 = new Double[nums.size()];
		int i = 0;
		for(String num : nums){
			nums2[i] = Double.parseDouble(num);
			i++;
		}
		for(Double d : nums2){
		 System.out.print(d + " ");
		}
		for(String s : findSign){
			System.out.print(s + " ");
		}

		double sum = nums2[0];
		int j = 1;
		for(String s : findSign){
				if(s.equals("+")){
					sum += nums2[j];
				}
			else{
					sum -= nums2[j];
				}
				j++;
		}
		
		System.out.println(sum);
	}

}
