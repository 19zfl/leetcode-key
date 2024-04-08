package com.zfl19.leetcode.key.simple;

/**
 * @ClassName:S9PalindromicNumber
 * @Description:
 *
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数
 * 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * @Author:zfl19
 * @CreateDate:2024/4/8 23:27
 */

public class S9PalindromicNumber {

    public boolean isPalindrome(int x) {
        String str =  String.valueOf(x);
        if (str.contains("-") && x < 0) return false;
        char[] original = str.toCharArray();
        for (int i = 0; i < original.length / 2; i++) {
            if (original[i] != original[original.length - i - 1]) return false;
        }
        return true;
    }

}
