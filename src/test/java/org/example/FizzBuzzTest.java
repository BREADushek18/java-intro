package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(7));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(35));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("3", FizzBuzz.fizzBuzz(3));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("6", FizzBuzz.fizzBuzz(6));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
        assertEquals("9", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(14));
    }
}
