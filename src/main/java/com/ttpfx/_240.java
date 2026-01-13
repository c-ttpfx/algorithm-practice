package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/13
 */
public class _240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0;
        int y = matrix[0].length - 1;
        while (x < matrix.length && y >= 0) {
            if (matrix[x][y] < target) {
                x++;
            } else if (matrix[x][y] > target) {
                y--;
            } else {
                return true;
            }
        }

        return false;
    }
}
