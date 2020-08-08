/* *****************************************************************************
Write a filter InfixToPostfix that converts an arithmetic expression from infix to postfix.
 **************************************************************************** */

import java.util.Scanner;

public class InfixToPostfix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<String>();
        String postfix = "";

        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("^") || input.equals("+") || input.equals("-") || input.equals("*")
                    || input.equals("^") || input.equals("%"))
                st.push(input);
            else if (input.equals("("))
                postfix += "";
            else if (input.equals(")"))
                postfix += st.pop() + " ";
            else
                postfix += input + " ";
        }

        System.out.println(postfix);
    }
}
