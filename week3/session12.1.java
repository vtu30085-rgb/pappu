import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String date = "2019-01-09";

        LocalDate d = LocalDate.parse(date);

        int dayOfYear = d.getDayOfYear();

        System.out.println("Day of the Year: " + dayOfYear);
    }
}
