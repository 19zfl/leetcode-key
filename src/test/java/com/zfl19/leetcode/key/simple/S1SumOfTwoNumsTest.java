package com.zfl19.leetcode.key.simple;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class S1SumOfTwoNumsTest {

    @Test
    public void twoSum() {

        S1SumOfTwoNums s1SumOfTwoNums = new S1SumOfTwoNums();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ints = s1SumOfTwoNums.twoSum(arr, target);
        System.out.println(Arrays.toString(ints));

    }
}