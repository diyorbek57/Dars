public class Tasks_11 {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        int[] mauntainArray = {1, 2, 3, 4, 5, 3, 2, 1};
//        System.out.println(checkStraightLine(coordinates));
        System.out.println(checkMauntainArray(mauntainArray));
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