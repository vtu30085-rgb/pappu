import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String date = "2026-08-14";

        LocalDate d = LocalDate.parse(date);

        String day = d.format(
            DateTimeFormatter.ofPattern("EEEE")
        );

        System.out.println("Day of the Week: " + day);
    }
}
