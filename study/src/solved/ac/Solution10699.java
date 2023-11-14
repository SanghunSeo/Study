package solved.ac;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution10699 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter today = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = date.format(today);
		System.out.println(formattedDate);

	}
}
