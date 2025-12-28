package com.ttpfx;

/**
 * @author ttpfx
 * @since 2025/12/28
 */
public class _53 {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int preSum = 0;
        for (int num : nums) {
            if (preSum < 0) {
                preSum = num;
            } else {
                preSum += num;
            }
            res = Math.max(res, preSum);
        }
        return res;
    }

}
