import java.util.Scanner;

public class Tasks_10 {


    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
                while (true) {
            System.out.println("Filter");
            System.out.println("1.Show by ID");
            System.out.println("2.Show by Alphabet");
            System.out.println("3.Show by Status");
            System.out.print("Choose one: ");

            if (option == 0) {
                System.out.println("Bye!");
                break;
            }
            if (option == Kunlar.SORT_BY_ID.getNumVal()) {
                app.sortByID();
            } else if (option == Kunlar.SORT_BY_NAME.getNumVal()) {
                app.sortByName();
            } else if (option == Kunlar.SORT_BY_STATUS.getNumVal()) {
                app.sortByStatus();
            } else {
                System.out.println("Bunday menyu mavjud emas !");
            }


        }
          }


}
