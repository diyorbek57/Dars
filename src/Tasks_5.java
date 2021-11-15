import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//public class Tasks_5 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3,5};
//
////        System.out.println(task_1(arr));
////        System.out.println(task_2("salom", "hello"));
//     //   System.out.println(task_3(20));
////        System.out.println(task_4(3, 2, 5));
////        System.out.println(task_5(1,2,3));
////        System.out.println(task_6(arr));
////        System.out.println(task_7(arr));
//        System.out.println(task_8(arr));
////        System.out.println(task_9(arr));
////         task_10(arr);
//    }
//
//    //Squares of a Sorted Array (Task-7)
//    private static void task_10(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * arr[i];
//        }
//
//        Arrays.sort(arr);
//
//        //print array values
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    //Monotonic (Task-6)
//    private static boolean task_9(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i - 1] || arr[i] == arr[i - 1]) return false;
//        }
//        return true;
//    }
//
//    //missing number (Task-5)
//    private static int task_8(int[] arr) {
//        int total = 1;
//        for (int i = 2; i <= (arr.length + 1); i++) {
//            total += i;
//            total -= arr[i - 2];
//        }
//        return total;
//
//    }
//
//    // fixed point (Task-4)
//    private static int task_7(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i)
//                return i;
//        }
//        return -1;
//    }
//
//    //Peak number (Task-3)
//    private static int task_6(int[] arr) {
//
//        if (arr.length == 1)
//            return -1;
//        if (arr[0] >= arr[1])
//            return -1;
//        if (arr[arr.length - 1] >= arr[arr.length - 2])
//            return arr.length - 1;
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
//                return arr[i];
//        }
//        return 0;
//    }
//
//    //using VarArgs for find medium(Task-2)
//    private static int task_5(int... num) {
//        int sum = 0;
//        int count = num.length;
//        for (int i : num) {
//            sum += i;
//        }
//        return sum / count;
//    }
//
//    //medium of 3 numbers (Task-1)
//    private static int task_4(int i, int i1, int i2) {
//        return i + i1 + i2 / 3;
//    }
//
//
//    //fibanaci (Doska-3)
//    private static int salom (int enteredNumber) {
//        //for loop ishlatish
////        for (int i = enteredNumber; i <=5; i++) {
////            enteredNumber+=enteredNumber;
////        }
//
//        //Recursive call
////        if (enteredNumber <= 0) {
////            return 0;
////        } else {
////            return enteredNumber + task_3(enteredNumber - 1);
////        }
////    }
//
////    //check to anagram   (Doska-2)
////    private static boolean task_2(String string1, String string2) {
////        String s1 = string1.replaceAll("\\s", "");
////        String s2 = string2.replaceAll("\\s", "");
////        boolean status = true;
////        if (s1.length() != s2.length()) {
////            status = false;
////        } else {
////            char[] ArrayS1 = s1.toLowerCase().toCharArray();
////            char[] ArrayS2 = s2.toLowerCase().toCharArray();
////            Arrays.sort(ArrayS1);
////            Arrays.sort(ArrayS2);
////            status = Arrays.equals(ArrayS1, ArrayS2);
////        }
////        if (status) {
////            return status;
////        }
////        return false;
////    }
////
////    //put to map  (Doska-1)
////    private static Map<Integer, Integer> task_1(int[] arr) {
////        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
////        for (int item : arr) {
////            map.put(item, map.getOrDefault(item, 0) + 1);
////        }
////        return map;
////
////    }
//}
//}
//////////////////////////////
//int freq[] = new int[26];
//
//        // to store maximum frequency
//        int max = -1;
//
//        // to store the maximum occurring character
//        char result = 0;
//
//        // length of 'str'
//        int len = str.length;
//
//        // get frequency of each character of 'str'
//        for (int i = 0; i < len; i++) {
//        if (str[i] != ' ') {
//        freq[str[i] - 'a']++;
//        }
//        }
//
//        // for each character, where character is obtained by
//        // (i + 'a') check whether it is the maximum character
//        // so far and accodingly update 'result'
//        for (int i = 0; i < 26; i++) {
//        if (max < freq[i]) {
//        max = freq[i];
//        result = (char) (i + 'a');
//        }
//        }
//
//        // maximum occurring character
//        return result;
//        }

// String str = "grass is greener on the other side";
//
//
//        System.out.println("Minimum occurring character: " + minChar);
//        System.out.println("Maximum occurring character: " + maxChar);
//        }
//        }







