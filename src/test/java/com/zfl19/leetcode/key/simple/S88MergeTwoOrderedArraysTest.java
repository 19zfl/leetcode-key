package com.zfl19.leetcode.key.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class S88MergeTwoOrderedArraysTest {

    @Test
    public void merge() {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        int m = 6;
        int n = 3;
        S88MergeTwoOrderedArrays s88MergeTwoOrderedArrays = new S88MergeTwoOrderedArrays();
        s88MergeTwoOrderedArrays.merge(nums1, m, nums2, n);
    }
}