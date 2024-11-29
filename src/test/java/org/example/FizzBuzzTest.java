package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzCase0(){
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));

        ArrayList<String> actual = FizzBuzz.fizzBuzz(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzCase1(){
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz","31","32","Fizz","34","Buzz","Fizz","37","38","Fizz","Buzz","41","Fizz","43","44","FizzBuzz","46","47","Fizz","49","Buzz","Fizz","52","53","Fizz","Buzz","56","Fizz","58","59","FizzBuzz","61","62","Fizz","64","Buzz"));

        ArrayList<String> actual = FizzBuzz.fizzBuzz(65);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzCase2(){
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz"));

        ArrayList<String> actual = FizzBuzz.fizzBuzz(12);
        Assertions.assertEquals(expected, actual);
    }
}
