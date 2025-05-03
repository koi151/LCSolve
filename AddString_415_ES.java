package com.javalearn;

import java.io.PrintWriter;

public class AddString_415_ES {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0; // num2 > num1
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        String num1 = "456";
        String num2 = "77";

        out.print(addStrings(num1, num2));
        out.flush();
        out.close();
    }
}
