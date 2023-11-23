import java.util.Random;
public class aaa {
    public static void main(String[] args) {
        int[] dice1 = new int[10];
        Random random = new Random();
        // Populating the array
        for (int i = 0; i < dice1.length; i++) {
            dice1[i] = random.nextInt(6) + 1; // Adding 1 to get values between 1 and 6
        }
        // Printing the array using an enhanced for loop
        System.out.print("dice1 = ");
        for (int value : dice1) {
            System.out.print(value + " ");
        }
    }
}
