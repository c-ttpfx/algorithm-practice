package com.ttpfx;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ttpfx
 * @since 2025/12/26
 */
public class _128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }

            // 第一次扫描到
            map.put(num,1);
            max = Math.max(max, 1);

            // 1 2 4 5
            // 这个时候扫描到3
            // 更新 1 和 5 序列最大值
            if (map.containsKey(num - 1) && map.containsKey(num + 1)) {
                int leftMaxValue = map.get(num - 1);
                int rightMaxValue = map.get(num + 1);
                map.put(num - leftMaxValue, leftMaxValue + rightMaxValue + 1);
                map.put(num + rightMaxValue, leftMaxValue + rightMaxValue + 1);
                max = Math.max(max, leftMaxValue + rightMaxValue + 1);
                continue;
            }

            // 1 2
            // 扫描到3
            // 更新1 和 3 最大值
            if (map.containsKey(num - 1)) {
                int leftMaxValue = map.get(num - 1);
                map.put(num - leftMaxValue, leftMaxValue + 1);
                map.put(num, leftMaxValue + 1);
                max = Math.max(max, leftMaxValue + 1);
                continue;
            }

            // 4 5
            // 扫描到3
            // 更新 3 和 5 最大值
            if (map.containsKey(num + 1)) {
                int rightMaxValue = map.get(num + 1);
                map.put(num + rightMaxValue, rightMaxValue + 1);
                map.put(num, rightMaxValue + 1);
                max = Math.max(max, rightMaxValue + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _128 xxx = new _128();
        int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,-4,6,6,-3};
        int i = xxx.longestConsecutive(nums);
        System.out.println(i);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
    }
}
