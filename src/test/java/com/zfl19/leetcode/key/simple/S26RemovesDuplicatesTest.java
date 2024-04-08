package com.zfl19.leetcode.key.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class S26RemovesDuplicatesTest {

    @Test
    public void removeDuplicates() {

        S26RemovesDuplicates s26RemovesDuplicates = new S26RemovesDuplicates();

        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // 输入数组
        int[] expectedNums = {0,1,2,3,4}; // 长度正确的期望答案

        int k = s26RemovesDuplicates.removeDuplicates(nums); // 调用

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }
}