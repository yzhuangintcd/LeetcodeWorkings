import java.util.*;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    answer += 4;
                    // check neighbours
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] == 1) {
                            answer--;
                        }
                    }

                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] == 1) {
                            answer--;
                        }
                    }

                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 1) {
                            answer--;
                        }
                    }

                    if (j + 1 < grid[i].length) {
                        if (grid[i][j + 1] == 1) {
                            answer--;
                        }
                    }

                }

            }
        }

        return answer;
    }

    // Helper Function to print out arrays of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution tester = new Solution();
        int[][] grid1 = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
        int[][] grid2 = { { 1 } };
        int[][] grid3 = { { 1, 0 } };

        System.out.println(tester.islandPerimeter(grid3));
    }
}
