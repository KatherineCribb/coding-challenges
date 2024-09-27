package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayChallengesTest {
    @Test
    void productExceptSelfTestCase1(){
        int[] nums = {1,2,3,4};

        int[] actual = ArrayChallenges.productExceptSelf(nums);
        assertEquals(24, actual[0]);
        assertEquals(12, actual[1]);
        assertEquals(8, actual[2]);
        assertEquals(6, actual[3]);
    }

    @Test
    void productExceptSelfTestCase2(){
        int[] nums = {-1,1,0,-3,3};

        int[] actual = ArrayChallenges.productExceptSelf(nums);
        assertEquals(0, actual[0]);
        assertEquals(0, actual[1]);
        assertEquals(9, actual[2]);
        assertEquals(0, actual[3]);
        assertEquals(0, actual[4]);
    }

    @Test
    void productExceptSelfTestCase3(){
        int[] nums = {-1,1,0,-3,0};

        int[] actual = ArrayChallenges.productExceptSelf(nums);
        assertEquals(0, actual[0]);
        assertEquals(0, actual[1]);
        assertEquals(0, actual[2]);
        assertEquals(0, actual[3]);
        assertEquals(0, actual[4]);
    }
}
