package com.zfl19.leetcode.key.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class S27RemoveElementTest {

    @Test
    public void removeElement() {

        S27RemoveElement s27RemoveElement = new S27RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        int i = s27RemoveElement.removeElement(nums, val);
        assertEquals(2, i);


    }
}