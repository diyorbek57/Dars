import java.util.ArrayList;
import java.util.Scanner;

public class ITAcademy {
    private Scanner scanner;
    private ArrayList<AcademyInfo> academy;

    public ITAcademy() {
        scanner = new Scanner(System.in);
        academy = new ArrayList<>();
        availableList();

    }

    public void start() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.O'quv markazlar ma'lumoti");
            System.out.println("2.O'quv markazi qo'shish");
            System.out.println("0.Chiqish");
            System.out.print("Menyuni tanlang: ");
            int option = scanner.nextInt();
            if (option == 0) {
                System.out.println("Xayr!");
                break;
            }

            if (option == 1) {
                showAcademy();
            } else if (option == 2) {
                addAcademy();
            } else {
                System.out.println("Bunday menyu mavjud emas !");
            }
        }
    }

    private void addAcademy() {
        System.out.print("Nomi:");
        String nomi = scanner.next();
        System.out.print("Asoschisi:");
        String asoschisi = scanner.next();
        System.out.print("Tashkil etilgan yili:");
        String tashkilEtilganYili = scanner.next();
        System.out.print("O'quvchilar soni:");
        String oquvchilarSoni = scanner.next();
        System.out.print("Filiallar soni:");
        String filiallarSoni = scanner.next();
        System.out.print("Ta'lim yo'nalishi:");
        String talimYonalishi = scanner.next();

        AcademyInfo academyInfo = findAcademy(nomi);

        if (academyInfo != null) {
            System.out.println("Ushbu Academiya kiritilgan !");
            return;
        }

        academy.add(new AcademyInfo(nomi, asoschisi, tashkilEtilganYili, oquvchilarSoni, filiallarSoni, talimYonalishi));
        System.out.println("Ma'lumot muvaffaqiyali qo'shildi !");
    }

    private AcademyInfo findAcademy(String nomi) {
        for (int i = 0; i < academy.size(); i++) {
            if (academy.get(i).getNomi().equals(nomi)) {
                return academy.get(i);
            }
        }
        return null;
    }

    private void showAcademy() {

        System.out.println("\n\n----------------------- Users ------------------------------");
        System.out.println("Nomi\t\tAsoschisi\t\tTashkil etilgan yili\t\tO'quvchilar soni\t\tFiliallar soni\t\tTa'lim yo'nalishi");
        for (int i = 0; i < academy.size(); i++) {
            AcademyInfo academyInfo = academy.get(i);
            System.out.println(academyInfo.getNomi() + "\t\t" + academyInfo.getAsoschisi() +
                    "\t\t" + academyInfo.getFiliallarSoni() + "\t\t" + academyInfo.getOquvchilarSoni() +
                    "\t\t" + academyInfo.getTalimYonalishi() + "\t\t" + academyInfo.getTashkilEtilganYili() + "\n");
            System.out.println("------------------------------------------------------------\n");
        }
        System.out.println("------------------------------------------------------------\n\n");
    }

    private void availableList() {
        academy.add(new AcademyInfo("nomalum1", "folonchi1", "qachondur1",
                "-", "-", "nomalum1"));
        academy.add(new AcademyInfo("nomalum2", "folonchi2", "qachondur2",
                "-", "-", "nomalum2"));
        academy.add(new AcademyInfo("nomalum3", "folonchi3", "qachondur3",
                "-", "-", "nomalum3"));
    }

//    private boolean deleteAccount() {
//        System.out.print("Nomi:");
//        String deleteNomi = scanner.next();
//        System.out.print("Ishonchingiz komilmi ?(y/n):");
//        String result = scanner.next();
//
//        if (result.equalsIgnoreCase("y")) {
//            academy.remove(deleteNomi);
//            System.out.println("Foydalanuvchi o'chirildi.");
//            return true;
//        }
//
//        return false;
//    }

}
