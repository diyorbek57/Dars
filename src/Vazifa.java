import java.util.Scanner;

public class Vazifa {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }else if (i>4){
                continue;
            }
        }
    }


}
