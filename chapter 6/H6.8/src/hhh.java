import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class hhh {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));
        LocalDate baseYear = LocalDate.of(1776, Month.JULY, 4);
        LocalDate centennialDate = baseYear.plusYears(100); // Get the date 100 years later
        boolean isPresent = false;
        for (LocalDate date : centennials) {
            if (date.equals(centennialDate)) {
                isPresent = true;
                break;
            }
        }
        System.out.println("Centennial present = " + isPresent);
    }
}
