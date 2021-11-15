import java.util.HashMap;
import java.util.Map;


public class Tasks_4 {

    public static void main(String[] args) {
        String task_2 = "1100001";
        String task_3 = "Hello world";
        int[] arr = {2, 1, 2, 3, 3};
//        task_1();
//        task_2(task_2);
//        task_3(task_3);
        System.out.println(task_4(arr));
    }

    private static Map<Integer, Integer> task_4(int[] arr) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;

    }

    private static void task_3(String s) {
//        String words[] = s.split(" ");
//        String rs = "";
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String rw = "";
//            for (int j = word.length() - 1; j >= 0; j--) {
//                rw = rw + word.charAt(j);
//            }
//            rs = rs + rw + " ";
//        }
//        System.out.print(rs);
    }


    private static void task_2(String s) {
//        String c = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '0') {
//                c = c + '1';
//            } else {
//                c = c + '0';
//            }
//        }
//        System.out.println(c);


    }

    private static void task_1() {

    }
}
