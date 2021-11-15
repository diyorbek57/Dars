import java.util.TreeMap;

public class Tasks_3 {
    public static void main(String[] args) {
task_1();
    }

    private static void task_1() {
        TreeMap<Integer,Integer> map= new TreeMap<>();
        for (int i = 20; i >= 10; i--) {
        if (i==10 ||i>10){
            map.put(i,0);
            System.out.println(map.keySet());
        }

        }

    }


}
