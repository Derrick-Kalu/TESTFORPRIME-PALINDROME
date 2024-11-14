package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testIsPrime() {
        PrimeChecker primeChecker = new PrimeChecker();

        // Test some prime numbers
        assertTrue(primeChecker.isPrime(2), "2 should be prime");
        assertTrue(primeChecker.isPrime(3), "3 should be prime");
        assertTrue(primeChecker.isPrime(5), "5 should be prime");
        assertTrue(primeChecker.isPrime(7), "7 should be prime");
        assertTrue(primeChecker.isPrime(11), "11 should be prime");

        // Test some non-prime numbers
        assertFalse(primeChecker.isPrime(1), "1 is not prime");
        assertFalse(primeChecker.isPrime(4), "4 is not prime");
        assertFalse(primeChecker.isPrime(6), "6 is not prime");
        assertFalse(primeChecker.isPrime(8), "8 is not prime");
        assertFalse(primeChecker.isPrime(9), "9 is not prime");
        assertFalse(primeChecker.isPrime(10), "10 is not prime");
    }
}
