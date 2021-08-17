package com.leetcode;

public class leetcode03 {
    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("第一个:"+lengthOfLongestSubstring("abcabcbb"));
        System.out.println("第二个:"+lengthOfLongestSubstring(""));
        System.out.println("第三个:"+lengthOfLongestSubstring(" "));
    }
}
