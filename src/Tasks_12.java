import java.util.Stack;

public class Tasks_12 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        String str = "Hello wold";
        reverseWords(str);
        deleteMid(stack, stack.size(), 0);

        while (!stack.empty()) {
            int p = stack.pop();
            System.out.print(p + " ");
        }
    }

    static void deleteMid(Stack<Integer> st, int n, int curr) {
        if (st.empty() || curr == n)
            return;
        int x = st.pop();
        deleteMid(st, n, curr + 1);
        if (curr != n / 2)
            st.push(x);
    }

    static void reverseWords(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (!st.empty()) {
                    System.out.print(st.pop());

                }
                System.out.print(" ");

            }

        }
        while (!st.empty()) {
            System.out.print(st.pop());

        }

    }
}
