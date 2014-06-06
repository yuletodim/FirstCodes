import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int bit = n & 1;
			if (bit == 1){
				count++;
			}
			n = n >> 1;
		}
		System.out.println(count);
		

	}

}
