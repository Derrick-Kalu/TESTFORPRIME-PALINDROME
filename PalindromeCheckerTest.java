package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Test basic palindromes
        assertTrue(palindromeChecker.isPalindrome("driver"), "'driver' should be a palindrome");
        assertTrue(palindromeChecker.isPalindrome("sportscar"), "'sportscar' should be a palindrome");

        // Test case-insensitivity and spaces
        assertTrue(palindromeChecker.isPalindrome("A van cannot be abuja"), "'A van cannot be abuja' should be a palindrome");
        assertTrue(palindromeChecker.isPalindrome("less talking, more working"), "'less talking, more working' should be a palindrome");

        // Test non-palindromic strings
        assertFalse(palindromeChecker.isPalindrome("hello"), "'hello' should not be a palindrome");
        assertFalse(palindromeChecker.isPalindrome("Java"), "'Java' should not be a palindrome");

        // Test empty and null strings
        assertTrue(palindromeChecker.isPalindrome(""), "Empty string should be considered a palindrome");
        assertFalse(palindromeChecker.isPalindrome(null), "null should not be considered a palindrome");
    }
}
