package com.ttpfx;

/**
 * @author ttpfx
 * @since 2025/12/27
 */
public class _42 {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        int minHeight = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                res = res - Math.min(height[l], minHeight);
                if (height[l] > minHeight){
                    res = res + (height[l] - minHeight) * (r - l - 1);
                    minHeight = height[l];
                }
                l++;
            } else {
                res = res - Math.min(height[r], minHeight);
                if (height[r] > minHeight){
                    res = res + (height[r] - minHeight) * (r - l - 1);
                    minHeight = height[r];
                }
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _42 v = new _42();
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(v.trap(nums));
    }
}
