import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Current date
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        // Current time
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);

        // Get individual values
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());

        // Add days
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);

        // Subtract days
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday: " + yesterday);

        // Format date
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Formatted Date: " + date.format(formatter));
    }
}
