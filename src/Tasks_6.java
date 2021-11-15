public class Tasks_6 {
    static int num1 = 0, num2 = 1, num3 = 0;

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0, count = 20;
        System.out.print("Solutin-1: ");
        printFibonacciSeriesFirstSolution(num1, num2, num3, count);
        System.out.println();
        System.out.print("Solutin-2: ");
        printFibonacciSeriesSecondSolution(count - 2);
        System.out.println();
        System.out.print("Solutin-3: ");
        for (int i = 2; i < count; i++) {
            System.out.print(" " + printFibonacciSeriesThirdSolution(i));
        }

    }

    private static int printFibonacciSeriesThirdSolution(int count) {
        if (count <= 1)
            return count;
        return printFibonacciSeriesThirdSolution(count - 1) + printFibonacciSeriesThirdSolution(count - 2);
    }

    private static void printFibonacciSeriesSecondSolution(int count) {
        if (count > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
            printFibonacciSeriesSecondSolution(count - 1);
        }
    }

    private static void printFibonacciSeriesFirstSolution(int num1, int num2, int num3, int count) {
        for (int i = 2; i < count; ++i) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

