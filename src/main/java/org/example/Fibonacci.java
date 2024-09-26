package org.example;

import java.util.HashMap;

public class Fibonacci {
    static int counter;

    // Fibonacci Series using Recursion (top-down approach)
    static int fibRecursion(int n){
        counter++;//for n=5, it is called 15 times
        if(n<=1){//base case
            return  n;
        }
        return fibRecursion(n-1) + fibRecursion(n-2);//recurrence relation
    }


    // Fibonacci Series using Dynamic Programming Memoization (top-down approach)
    static int fibMemoization(int n, HashMap<Integer, Integer> calculated){
        counter++;//for n=5, it is called 9 times
        if (n<=1){
            return n;
        }
        if (calculated.containsKey(n)){
            return calculated.get(n);
        } else{
            int result = fibMemoization(n-1, calculated) + fibMemoization(n-2, calculated);
            calculated.put(n, result);
            return result;
        }
    }

    // Fibonacci Series using Dynamic Programming Tabulated (bottom-up approach)
    static int fibTabulated(int n) {
        // Declare an array to store Fibonacci numbers.
        int f[] = new int[n + 2];// 1 extra to handle case, n = 0

        //0th and 1st number of the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Add the previous 2 numbers in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
