package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayChallengesTest {

    //PRODUCT OF ARRAY EXCEPT SELF
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
    //END PRODUCT OF ARRAY EXCEPT SELF


    //MAX SUB ARRAY
    @Test
    void maxSubArrayTestCase1(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        assertEquals(6, ArrayChallenges.maxSubArray(nums));
    }

    @Test
    void maxSubArrayTestCase2(){
        int[] nums = {1};

        assertEquals(1, ArrayChallenges.maxSubArray(nums));
    }

    @Test
    void maxSubArrayTestCase3(){
        int[] nums = {5,4,-1,7,8};

        assertEquals(23, ArrayChallenges.maxSubArray(nums));
    }
    //END MAX SUB ARRAY

}
