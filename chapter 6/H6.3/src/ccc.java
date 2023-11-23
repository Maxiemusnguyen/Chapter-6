import java.util.ArrayList;
import java.util.Random;
public class ccc {
    public static void main(String[] args) {
        ArrayList<Integer> dice3 = new ArrayList<>();
        Random random = new Random();
        // Generating a random integer
        for (int i = 0; i < 10; i++) {
            int roll = random.nextInt(6) + 1; // Generating a value between 1 and 6
            dice3.add(roll); // Adding the result
        }
        // Printing the ArrayList
        System.out.print("dice3 = ");
        for (int value : dice3) {
            System.out.print(value + " ");
        }
    }
}
