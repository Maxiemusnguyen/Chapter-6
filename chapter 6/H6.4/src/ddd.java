import java.util.ArrayList;
import java.util.Random;
public class ddd {
    public static void main(String[] args) {
        ArrayList<Integer> dice4 = new ArrayList<>();
        Random random = new Random();
        // Generating a random integer
        for (int i = 0; i < 5; i++) {
            int roll = random.nextInt(6) + 1; // Generating a value between 1 and 6
            dice4.add(roll); // Adding the result
        }
        // Printing the ArrayList
        System.out.print("dice4 = ");
        for (int value : dice4) {
            System.out.print(value + " ");
        }
    }
}
