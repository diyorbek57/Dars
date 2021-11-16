import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tasks_11 {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        int[] mauntainArray = {1, 2, 3, 4, 5, 3, 2, 1};
//        System.out.println(checkStraightLine(coordinates));
        System.out.println(checkMauntainArray(mauntainArray));
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findDuplicates(ar));
        Stack<String> strings=new Stack<>();
        strings.push("daad");

        ArrayDeque<String> strings1=new ArrayDeque<>();

    }

    private static boolean checkMauntainArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < array.length - 1 && array[left] < array[left + 1]) {
            left = left + 1;
        }
        while (right > 0 && array[right - 1] > array[right]) {
            right = right - 1;
        }
        if (left > 0 && left == right && right < array.length - 1) {
            return true;

        } else return false;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos]<0){
                res.add(pos+1);
            }
            nums[pos] = -nums[pos];
        }
        return res;
    }

//    public static boolean checkStraightLine(int[][] c) {
//        int x = c[1][0] - c[0][0];
//        int y = c[1][1] - c[0][1];
//        int xN = 0, yN = 0;
//        for (int i = 2; i < c.length; i++) {
//
//            xN = c[i][0] - c[i - 1][0];
//            yN = c[i][1] - c[i - 1][1];
//            if (x * yN != y * xN) {
//                return false;
//            }
//        }
//        return true;
//    }

}