import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        String date1 = "2019-06-29";
        String date2 = "2019-06-30";

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        long days = Math.abs(ChronoUnit.DAYS.between(d1, d2));

        System.out.println("Number of Days: " + days);
    }
}
