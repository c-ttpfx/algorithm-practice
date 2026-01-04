package com.ttpfx;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ttpfx
 * @since 2026/1/4
 */
public class _73 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int subRowCount = 0;
        int subColCount = 0;
        int total = matrix.length * matrix[0].length;
        int row = 0;
        int col = 0;
        List<Integer> ans = new ArrayList<>();
        // 上1 下2 左3 右4
        int direction = 4;
        while (ans.size() < total){
            ans.add(matrix[row][col]);
            if (direction == 4){
                if (col < matrix[0].length - subColCount - 1){
                    col++;
                }else {
                    direction = 2;
                    row++;
                }
            }else if (direction == 2){
                if (row < matrix.length - subRowCount - 1){
                    row++;
                }else {
                    direction = 3;
                    col--;
                }
            }else if (direction == 3){
                if (col > subColCount){
                    col--;
                }else {
                    direction = 1;
                    subRowCount++;
                    row--;
                }
            }else {
                if (row > subRowCount){
                    row--;
                }else {
                    direction = 4;
                    subColCount++;
                    col++;
                }
            }
        }
        return ans;
    }
}
