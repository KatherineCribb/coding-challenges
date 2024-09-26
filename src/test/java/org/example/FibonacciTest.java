package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void fibRecursion(){
        assertEquals(0, Fibonacci.fibRecursion(0));
        assertEquals(1, Fibonacci.fibRecursion(1));
        assertEquals(1, Fibonacci.fibRecursion(2));
        assertEquals(2, Fibonacci.fibRecursion(3));
        assertEquals(3, Fibonacci.fibRecursion(4));
        assertEquals(5, Fibonacci.fibRecursion(5));
        assertEquals(8, Fibonacci.fibRecursion(6));
        assertEquals(13, Fibonacci.fibRecursion(7));
        assertEquals(21, Fibonacci.fibRecursion(8));
        assertEquals(34, Fibonacci.fibRecursion(9));
    }

    @Test
    void fibMemoization(){
        assertEquals(1, Fibonacci.fibMemoization(1, new HashMap<>()));
        assertEquals(1, Fibonacci.fibMemoization(2, new HashMap<>()));
        assertEquals(2, Fibonacci.fibMemoization(3, new HashMap<>()));
        assertEquals(3, Fibonacci.fibMemoization(4, new HashMap<>()));
        assertEquals(5, Fibonacci.fibMemoization(5, new HashMap<>()));
        assertEquals(8, Fibonacci.fibMemoization(6, new HashMap<>()));
        assertEquals(13, Fibonacci.fibMemoization(7, new HashMap<>()));
        assertEquals(21, Fibonacci.fibMemoization(8, new HashMap<>()));
        assertEquals(34, Fibonacci.fibMemoization(9, new HashMap<>()));
    }

    @Test
    void fibTabulated(){
        assertEquals(0, Fibonacci.fibTabulated(0));
        assertEquals(1, Fibonacci.fibTabulated(1));
        assertEquals(1, Fibonacci.fibTabulated(2));
        assertEquals(2, Fibonacci.fibTabulated(3));
        assertEquals(3, Fibonacci.fibTabulated(4));
        assertEquals(5, Fibonacci.fibTabulated(5));
        assertEquals(8, Fibonacci.fibTabulated(6));
        assertEquals(13, Fibonacci.fibTabulated(7));
        assertEquals(21, Fibonacci.fibTabulated(8));
        assertEquals(34, Fibonacci.fibTabulated(9));
    }
}
