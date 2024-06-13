import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minMoves = 0;
        // ArrayList<Integer> seatList = new ArrayList<>();
        // ArrayList<Integer> studentList = new ArrayList<>();
        // for (int i = 0; i < students.length; i++) {
        // seatList.add(seats[i]);
        // }
        // for (int i = 0; i < students.length; i++) {
        // studentList.add(students[i]);
        // }
        // Collections.sort(seatList);
        // Collections.sort(studentList);
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            minMoves += Math.abs(seats[i] - students[i]);
        }
        // int minI = -1;
        // int minJ = -1;
        // for (int i = 0; i < studentList.size();) {
        // int min = Integer.MAX_VALUE;
        // for (int j = 0; j < seatList.size(); j++) {
        // if (Math.abs(studentList.get(i) - seatList.get(j)) <= min) {
        // min = Math.abs(studentList.get(i) - seatList.get(j));
        // minI = i;
        // minJ = j;
        // }
        // }
        // minMoves += min;
        // studentList.remove(minI);
        // seatList.remove(minJ);
        // }
        return minMoves;
    }

    // Helper Function to print out array of int
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Helper Function to print out 2d array of int
    public void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] seats = { 3,1,5 };
        int[] students = { 2,7,4 };
        System.out.println(s.minMovesToSeat(seats, students));
    }

}
