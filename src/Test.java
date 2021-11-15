import java.util.ArrayList;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> address = new ArrayList<>();
        address.add("khamdamov@gmail.com");
        address.add("uzbek@yahoo.com");
        address.add("me-100@gmail.com");
        address.add("me@me@gmail.com");
        address.add("me@.gmail.com");
        String s = "Android";
        char str[] = "sample program".toCharArray();
        checkStringUnicode(s);
        printMinimumAndMaximumOccurringCharacter(s);
        for (String i : address) {
            if (checkEmailValidate(i))
                System.out.println(i + " - valid");
            else
                System.out.println(i + " - invalid");
        }
    }

    private static boolean checkEmailValidate(String i) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (i == null)
            return false;
        return pat.matcher(i).matches();
    }


    private static void printMinimumAndMaximumOccurringCharacter(String s) {
        int[] freq = new int[s.length()];
        char minChar = s.charAt(0), maxChar = s.charAt(0);
        int i, j, min, max;
        char string[] = s.toCharArray();
        for (i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        min = max = freq[0];
        for (i = 0; i < freq.length; i++) {
            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string[i];
            }
            if (max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("Max=" + maxChar);
        System.out.println("Min=" + minChar);
    }


    private static void checkStringUnicode(String s) {
        for (char ch : s.toCharArray()) {
            if ((int) ch % 4 == 0) {
                System.out.println(ch + "==" + (int) ch);
            }
        }
    }
}
