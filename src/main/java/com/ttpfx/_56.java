package com.ttpfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ttpfx
 * @since 2025/12/28
 */
public class _56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int start = 0;
        int maxRV = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            maxRV = Math.max(maxRV, intervals[i][1]);
            if (maxRV < intervals[i + 1][0]) {
                list.add(new int[]{intervals[start][0], maxRV});
                start = i + 1;
                maxRV = 0;
            }
        }
        list.add(new int[]{intervals[start][0], Math.max(maxRV, intervals[intervals.length - 1][1])});
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        _56 v = new _56();
        int[][] intervals = new int[][]{
                {2, 3},
                {4, 5},
                {6, 7},
                {8, 9},
                {1, 10}
        };
        System.out.println(Arrays.deepToString(v.merge(intervals)));
    }
}
