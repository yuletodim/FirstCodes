import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;



public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstInput = scan.nextLine();
		String secondInput = scan.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");


		LocalDate firstDate = LocalDate.parse(firstInput, format);
		LocalDate secondDate = LocalDate.parse(secondInput, format);
		long d = ChronoUnit.DAYS.between(firstDate, secondDate);
		
		

		System.out.println(d);
	}

}
