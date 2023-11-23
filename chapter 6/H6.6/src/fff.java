import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class fff {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));
        System.out.println("Before removal:");
        printList(centennials);
        for (int i = 0; i < centennials.size(); i++) {
            if (centennials.get(i).getYear() == 1900) {
                centennials.remove(i);
                break;
            }
        }
        System.out.println("After removal:");
        printList(centennials);
    }
    public static void printList(ArrayList<LocalDate> list) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (LocalDate date : list) {
            System.out.println(formatter.format(date));
        }
        System.out.println("size = " + list.size());
    }
}
