import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter today = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = date.format(today);
		System.out.println(formattedDate);

	}    
}
