package com.javalearn;

import java.io.PrintWriter;
import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (c == '}') {
                    if (top != '{')
                        return false;
                } else if (c == ')') {
                    if (top != '(')
                        return false;
                } else if (top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        String s = "()[]{}}";
        ValidParentheses_20 test = new ValidParentheses_20();
        out.print(test.isValid(s));

        out.flush();
        out.close();
    }
}
