/* *****************************************************************************
Write a stack client Parentheses that reads a string of parentheses, square brackets,
and curly braces from standard input and uses a stack to determine whether they are properly
balanced. For example, your program should print true for [()]{}{[()()]()} and false for [(]).
 **************************************************************************** */

import java.util.Scanner;

public class ParenthesisCheck {
    public static boolean check(String s) {

        if (s.length() % 2 != 0)
            return false;
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == '{' || a == '[' || a == '(') {
                st.push(a);
            }
            else if (a == '}') {
                char pop = st.pop();
                if (pop == '[' || pop == '(')
                    return false;
            }
            else if (a == ')') {
                char pop = st.pop();
                if (pop == '[' || pop == '{')
                    return false;
            }
            else if (a == ']') {
                char pop = st.pop();
                if (pop == '(' || pop == '{')
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
}
