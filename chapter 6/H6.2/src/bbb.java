import java.util.Random;

public class bbb {
    public static void main(String[] args) {
        int[] dice2 = new int[6];
        Random random = new Random();
        // Populating the array
        for (int i = 0; i < dice2.length; i++) {
            dice2[i] = random.nextInt(6) + 1;
        }
        // Printing the array
        System.out.print("dice2 = ");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
    }
}
