package com.gc.ritter;

/**
 * Created by Mark on 7/27/2017.
 */
public class Lab16 {

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                // We are naive, but not stupid, if
                // the number has a divisor other
                // than 1 or itself, we return immediately.
                return false;
            }
        }
        return true;
    }

    public static int sequencePrime(int userInput) {
        int number;
        int count;
        for (number = 2, count = 0; count < userInput; ++number) {
            if (isPrime(number)) {
                ++count;
            }
        }
        // The candidate has been incremented once after the count reached n
        return number - 1;
    }
}