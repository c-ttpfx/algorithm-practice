package com.ttpfx;

/**
 * @author ttpfx
 * @since 2025/12/26
 */
public class _283 {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                l = Math.min(l, i);
            } else if (l < i) {
                nums[l++] = nums[i];
            }
        }
        while (l < nums.length) {
            nums[l++] = 0;
        }
    }
}
