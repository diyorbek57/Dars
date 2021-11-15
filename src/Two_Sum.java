public class Two_Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 2, 3};
        int[] two_number = new int[2];
        int a, b, target = 8;


        for (int i = 0; i < numbers.length; i++) {
            a = i;
            b = a;
            int plus = a + b;
            if (plus == target) {
                for (int j = 0; j < two_number.length; j++) {
                    two_number[j] = a;
                    two_number[j] = b;
                    System.out.println(two_number[j]);
                }

            }
        }

    }
}
