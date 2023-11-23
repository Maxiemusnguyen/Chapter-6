import java.util.ArrayList;
import java.util.HashSet;
public class eee {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};
        ArrayList<Integer> intersection = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int value : list1) {
            set.add(value);
        }
        for (int value : list2) {
            if (set.contains(value)) {
                intersection.add(value);
                set.remove(value);
            }
        }
        System.out.print("Intersection list: ");
        for (int value : intersection) {
            System.out.print(value + " ");
        }
    }
}

