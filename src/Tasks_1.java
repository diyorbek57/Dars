import java.util.Scanner;

public class Tasks_1 {

    public static void main(String[] args) {
        Scanner entered_1 = new Scanner(System.in);
        System.out.print("Birinchi belgin kiriting: ");
        char ch_1 = entered_1.next().charAt(0);
        System.out.println();
        Scanner entered_2 = new Scanner(System.in);
        System.out.print("Ikkinchi belgin kiriting: ");

        char ch_2 = entered_2.next().charAt(0);

        task_2(ch_1, ch_2);
        System.out.println();
        task_3(50000);
    }

    private static void task_3(int n) {
        int minut = n / 60;
        int soat = minut / 60;
        System.out.print("minut: " + minut + "\n" + "soat: " + soat);
    }

    private static void task_2(char a, char b) {
        for (char i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
