import java.util.Scanner;

public class Tasks_8 {
    public static void main(String[] args) {
//        Ishchi ishchi = new Ishchi();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ismini kiriting: ");
//        ishchi.setIsm(scanner.next());
//        System.out.print("Familyani kiriting: ");
//        ishchi.setFamilya(scanner.next());
//        System.out.print("Yoshini kiriting: ");
//        ishchi.setYoshi(scanner.next());
//        System.out.print("Jinsini kiriting: ");
//        ishchi.setJinsi(scanner.next());
//        System.out.print("Boy o'lchamini kiriting: ");
//        ishchi.setBoyi(scanner.next());
//        System.out.print("Ma'lumotini kiriting: ");
//        ishchi.setMalumoti(scanner.next());
//        System.out.print("Ish tajribasi necha yil ? : ");
//        ishchi.setTajribasi(scanner.next());
//        System.out.println("Ismi: " + ishchi.getIsm());
//        System.out.println("Familyasi: " + ishchi.getFamilya());
//        System.out.println("Yoshi: " + ishchi.getYoshi());
//        System.out.println("Jinsi: " + ishchi.getJinsi());
//        System.out.println("Bo'y o'lchami: " + ishchi.getBoyi());
//        System.out.println("Ma'lumoti: " + ishchi.getMalumoti());
//        System.out.println("Ish tajribasi: " + ishchi.getTajribasi());
        App app = new App();
        ITAcademy academys = new ITAcademy();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bosh menyu");
            System.out.println("1.IT Academy's Info");
            System.out.println("2.Futbol");
            System.out.println("3.Application");
            System.out.print("Menyuni tanlang: ");
            int options = scanner.nextInt();

            if (options == 1) {
                academys.start();
            } else if (options == 2) {
                System.out.println("------------------------------------------------------------\n");
                System.out.println("Uzur men futbol haqida hech narsani bilmayman !");
                System.out.println("------------------------------------------------------------\n");
            } else if (options == 3) {
//                app.start();
            } else {
                System.out.println("Bunday menyu mavjud emas !");
            }

        }
    }


}
