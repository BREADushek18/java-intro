package org.example;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            System.out.println(fizzBuzz(number));
        }
    }
}
