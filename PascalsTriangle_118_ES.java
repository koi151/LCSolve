package com.javalearn;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle_118_ES {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return new ArrayList<>();

        List<List<Integer>> li = new ArrayList<>();

        // first line always [1]
        li.add(new ArrayList<>());
        li.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = li.get(i - 1);

            row.add(1);
            for (int j = 1; j < prevRow.size(); j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            li.add(row);
        }

        return li;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        PascalsTriangle_118_ES test = new PascalsTriangle_118_ES();
        int numRows = 5;
        out.print(test.generate(numRows).toString());

        out.flush();
        out.close();
    }

//    Input: numRows = 5
//    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
}
