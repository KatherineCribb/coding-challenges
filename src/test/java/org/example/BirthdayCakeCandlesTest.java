package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayCakeCandlesTest {

    @Test
    void birthdayCakeCandles() {
        List<Integer> candles = new ArrayList<>();
        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);

        assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(candles));
    }

    @Test
    void birthdayCakeCandles5() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("birthdayCakeCandles/testCase5").getFile());
        Scanner s = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(s.hasNext()){
            list.add(Integer.valueOf(s.next()));
        }
        s.close();

        assertEquals(12443, BirthdayCakeCandles.birthdayCakeCandles(list));
    }
}
