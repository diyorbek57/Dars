import java.util.HashMap;

public class UniCodeTasks {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 3, 3, 4, 2};
        String item = "Hamdamov Diyorbek";
        String text = "1000 Android ㅋㅋㅋ";


//        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//        HashMap.Entry<Character,Integer> maxValue = null;
//        char[] sumbols=item.toLowerCase().toCharArray();
//        for (char key: sumbols ) {
//            if (key!=' '){
//                map.put(key,map.getOrDefault(key,0)+1);
//            }
//
//        }
//        for (HashMap.Entry<Character, Integer> value : map.entrySet()) {
//            if (maxValue == null || value.getValue().compareTo(maxValue.getValue()) > 0) {
//                maxValue = value;
//            }
//        }
        for (char c : item.toCharArray()) {
            if (c != ' ') {
                System.out.print((int) c + " ");
            }
        }
        System.out.println();
        for (int i = 97; i <122 ; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            if((int)c>=65 && (int)c<=90 ||(int)c>=97 && (int)c<=122 ) {
                System.out.print(c);
            }
        }
    }
}
