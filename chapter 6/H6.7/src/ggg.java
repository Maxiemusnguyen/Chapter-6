import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class ggg {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));
        // Determining the size of the ArrayList
        int size = centennials.size();
        System.out.println("size = " + size);
    }
}
