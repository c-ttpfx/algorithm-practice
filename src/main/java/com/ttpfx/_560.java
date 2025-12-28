package com.ttpfx;

import java.util.HashMap;

/**
 * @author ttpfx
 * @since 2025/12/28
 */
public class _560 {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0;
        for (int num : nums) {
            preSum += num;
            res += map.getOrDefault(preSum - k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new _560().subarraySum(new int[]{1}, 1));
    }
}
