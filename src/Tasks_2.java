import java.util.HashMap;

public class Tasks_2 {
    public static void main(String[] args) {
        int k = 3, a = 0, b;
        int[] arr = {1, 5, 3, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, 0);
            b = map.get(i) + k;
        }
        System.out.println(a);
    }
}
