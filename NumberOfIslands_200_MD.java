package com.javalearn;

import java.io.PrintWriter;

public class NumberOfIslands_200_MD {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void dfs(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';

        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        char[][] grid = {
            {'1', '1', '0', '0', '1'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        NumberOfIslands_200_MD test = new NumberOfIslands_200_MD();
        out.print(test.numIslands(grid));

        out.flush();
        out.close();
    }
}

