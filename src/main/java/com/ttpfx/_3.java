package com.ttpfx;

import java.util.Arrays;

/**
 * @author ttpfx
 * @since 2025/12/27
 */
public class _3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int[] arr = new int[128];
        Arrays.fill(arr, Integer.MAX_VALUE);
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] != Integer.MAX_VALUE) {
                p = Math.max(arr[s.charAt(i)] + 1, p);
            }
            res = Math.max(res, i - p + 1);
            arr[s.charAt(i)] = i;
        }
        return  res;
    }

    public static void main(String[] args) {
        _3 v = new _3();
        System.out.println(v.lengthOfLongestSubstring("abba"));
    }
}
