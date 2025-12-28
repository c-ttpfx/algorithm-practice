package com.ttpfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ttpfx
 * @since 2025/12/27
 */
public class _438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }
        int[] pArr = new int[26];
        int[] sArr = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a']++;
            sArr[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pArr, sArr)) {
            res.add(0);
        }
        for (int i = 1; i <= s.length() - p.length(); i++) {
            sArr[s.charAt(i - 1) - 'a']--;
            sArr[s.charAt(i + p.length() - 1) - 'a']++;
            if (Arrays.equals(pArr, sArr)) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _438 v = new _438();
        System.out.println(v.findAnagrams("cbaebabacd", "abc"));
    }
}
