package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    void twoSum(){
        int[] input = {2,7,11,15};
        int target = 9;

        int[] actual = TwoSum.getTwoSum(input, target);
        assertEquals(0, actual [0]);
        assertEquals(1, actual [1]);
    }

    @Test
    void twoSumShouldReturnOkWhenInputContainsHalfOfTargetValue(){
        int[] input = {3,2,4};
        int target = 6;

        int[] actual = TwoSum.getTwoSum(input, target);
        assertEquals(1, actual [0]);
        assertEquals(2, actual [1]);
    }

    @Test
    void twoSumShouldReturnOkWhenInputContainsJustHalfOfTargetValue(){
        int[] input = {3,3};
        int target = 6;

        int[] actual = TwoSum.getTwoSum(input, target);
        assertEquals(0, actual [0]);
        assertEquals(1, actual [1]);
    }

    @Test
    void twoSumNegativeValues(){
        int[] input = {11,-2,5,-7,13,10,1};
        int target = -9;

        int[] actual = TwoSum.getTwoSum(input, target);
        assertEquals(1, actual [0]);
        assertEquals(3, actual [1]);
    }

    @Test
    void twoSumShouldOkWhenTargetIsZero(){
        int[] input = {0,4,3,0};
        int target = 0;

        int[] actual = TwoSum.getTwoSum(input, target);
        assertEquals(0, actual [0]);
        assertEquals(3, actual [1]);
    }
}
