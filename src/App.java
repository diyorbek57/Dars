
import java.util.*;

public class App {
    private Scanner scanner;
    private ArrayList<User> users;
    private ArrayList<SecondUser> secondUsers;

    public App() {
        scanner = new Scanner(System.in);
        users = new ArrayList<>();
        secondUsers = new ArrayList<>();
        availableList();
    }

//    public void start() {
//        while (true) {
//            System.out.println("Filter");
//            System.out.println("1.Show by ID");
//            System.out.println("2.Show by Alphabet");
//            System.out.println("3.Show by Status");
//            System.out.println("4.(with out sort method)Show by Status");
//            System.out.println("7.Show by Gender");
//            System.out.println("0.Exit");
//            System.out.print("Choose one: ");
//            int option = scanner.nextInt();
//            if (option == 0) {
//                System.out.println("Bye!");
//                break;
//            }
//
//            if (option == 1) {
//                sortByID();
//            } else if (option == 2) {
//                sortByName();
//            } else if (option == 3) {
//                sortByStatus();
//            } else if (option == 4) {
//                sortByIdWithOutComparable();
//            } else if (option == 5) {
//                sortByNameWithOutComparable();
//            } else if (option == 6) {
//                sortByStatusWithOutComparable();
//            } else if (option == 7) {
//                sortByGender();
//            } else {
//                System.out.println("Bunday menyu mavjud emas !");
//            }
//        }
//    }

    public void sortByGender() {
        List<Character> order = Arrays.asList('E', 'A');
        users.sort(Comparator.comparing((User u) -> order.indexOf(u.getJinsi())).thenComparing(User::getJinsi));
        System.out.println(users);
    }

    public void sortByStatusWithOutComparable() {
        List<String> order = Arrays.asList("online", "offline");
        secondUsers.sort(Comparator.comparing((SecondUser u) -> order.indexOf(u.getState())).thenComparing(SecondUser::getName));
        System.out.println(secondUsers);
    }

    public void sortByNameWithOutComparable() {
        secondUsers.sort(Comparator.comparing(SecondUser::getName));
        for (SecondUser user : secondUsers) {
            System.out.println(user);
        }
    }

    public void sortByIdWithOutComparable() {
        secondUsers.sort(Comparator.comparing(SecondUser::getId));
        for (SecondUser user : secondUsers) {
            System.out.println(user);
        }
    }

    public void sortByStatus() {
        List<Boolean> order = Arrays.asList(true, false);
        users.sort(Comparator.comparing((User u) -> order.indexOf(u.getState())).thenComparing(User::getName));
        System.out.println(users);
    }

    public void sortByName() {
        Collections.sort(users, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        System.out.println(users);
    }

    public void sortByID() {
        Collections.sort(users);
        for (User user : users) {
            System.out.print(user);
        }
    }


//    private void registration() {
//        System.out.print("Username kiriting:");
//        String name = scanner.next();
//        System.out.print("Parol kiriting:");
//        String password = scanner.next();
//        System.out.print("Parolni tasdiqlang:");
//        String confirmPassword = scanner.next();
//
//        User user = findUser(name);
//
//        if (user != null) {
//            System.out.println("Ushbu Username band !");
//            return;
//        }
//
//        if (!password.equals(confirmPassword)) {
//            System.out.println("Parol to'gri kelmadi");
//            return;
//        }
//
//        users.add(new User(name, password));
//        System.out.println("Ro'yxatdan o'ting muvaffaqiyali yakunlandi !");
//    }

//    private void showUsers() {
//        System.out.println("\n\n----------------------- Users ------------------------------");
//        System.out.println("Username\t\tParol");
//        for (int i = 0; i < users.size(); i++) {
//            User u = users.get(i);
//            System.out.println(u.getName() + "\t\t" + u.getPassword());
//        }
//        System.out.println("------------------------------------------------------------\n\n");
//    }

    //    private User findUser(String name) {
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getName().equals(name)) {
//                return users.get(i);
//            }
//
//        }
//
//        return null;
//    }
    private void availableList() {
        users.add(new User(1, "First-p", "online", 'E'));
        users.add(new User(2, "y", "offline", 'A'));
        users.add(new User(3, "f", "online", 'E'));
        users.add(new User(4, "q", "offline", 'A'));
        users.add(new User(5, "w", "online", 'E'));
        users.add(new User(6, "r", "offline", 'E'));
        users.add(new User(7, "t", "online", 'A'));
        users.add(new User(8, "b", "offline", 'E'));
        users.add(new User(9, "a", "online", 'E'));
        users.add(new User(10, "o", "offline", 'A'));
        //second
        secondUsers.add(new SecondUser(1, "Second-p", "online"));
        secondUsers.add(new SecondUser(2, "Second-y", "offline"));
        secondUsers.add(new SecondUser(3, "Second-f", "online"));
        secondUsers.add(new SecondUser(4, "Second-q", "offline"));
        secondUsers.add(new SecondUser(5, "Second-w", "online"));
        secondUsers.add(new SecondUser(6, "Second-r", "offline"));
        secondUsers.add(new SecondUser(7, "Second-t", "online"));
        secondUsers.add(new SecondUser(8, "Second-b", "offline"));
        secondUsers.add(new SecondUser(9, "Second-a", "online"));
        secondUsers.add(new SecondUser(10, "Second-o", "offline"));
    }

//    private void userMenu(User user) {
//        while (true) {
//            System.out.println("Username:" + user.getName());
//            System.out.println("Parol:" + user.getPassword());
//            System.out.println("Email:" + user.getEmail());
//            System.out.println("Telefon raqami:" + user.getPhone());
//            System.out.println();
//
//            System.out.println("1.Taxrirlash");
//            System.out.println("2.Hisobni o'chirish");
//            System.out.println("3.Barcha foydalanuvchilar");
//            System.out.println("4.Bosh menyuga qaytish");
//
//            System.out.print("Menyuni tanlang:");
//            int option = scanner.nextInt();
//
//            if (option == 1) {
//                System.out.println("Ushbu funksiya kelgusi yangilanishlarda bo'ladi !");
//            } else if (option == 2) {
//                if (deleteAccount(user)) {
//                    return;
//                }
//            } else if (option == 3) {
//                showUsers();
//            } else if (option == 4) {
//                return;
//
//            } else {
//                System.out.println("Bunday menyu mavjud emas !");
//            }
//        }
//
//
//    }

//    private boolean deleteAccount(User user) {
//        System.out.print("Ishonchingiz komilmi ?(y/n):");
//        String result = scanner.next();
//
//        if (result.equalsIgnoreCase("y")) {
//            users.remove(user);
//            System.out.println("Foydalanuvchi o'chirildi.");
//            return true;
//        }
//
//        return false;
//    }
}

