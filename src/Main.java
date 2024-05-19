import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		LocalDate d04 = LocalDate.parse("2024-05-11");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-11T05:00:00");
		Instant d06 = Instant.parse("2024-05-11T05:00:00Z");
		
		System.out.println("d04 = " + d04);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		
		System.out.println("d05 = " + d05);
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + fmt2.format(d05));		
		
		LocalDate localDate = d06.atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("d06 = " + d06);
		System.out.println("d06 = " + localDate.format(fmt1));
		System.out.println("d06 = " + fmt1.format(localDate));
		
		LocalDateTime localDateTime = d06.atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("d06 = " + localDateTime);
		System.out.println("d06 = " + localDateTime.format(fmt2));
		System.out.println("d06 = " + fmt2.format(localDateTime));
		
		System.out.println("d06 = " + fmt3.format(d06));
	}
}
