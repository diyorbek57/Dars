import java.util.HashMap;

public class HashMapDars {
    public static void main(String[] args) {
    findMaxHashMap();
    findAverageHashMap();
    }


    public static void findMaxHashMap(){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap.Entry<Integer,Integer> maxValue = null;
        hashMap.put(1, 4);
        hashMap.put(2, 6);
        hashMap.put(3, 12);
        hashMap.put(4, 5);
        hashMap.put(5, 23);
        for (HashMap.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (maxValue == null || map.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = map;
            }
        }
        System.out.println(maxValue);
    }
    public static void findAverageHashMap(){
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < i; j++) {

                if (i/2==0) {

                }

            }
        }
    }
}
