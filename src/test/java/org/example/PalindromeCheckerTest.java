package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeCheckerTest {

    @Test
    public void testPalindromeWithNormalInput() {
        assertTrue(PalindromeChecker.checkPalindrome("level"));
        assertTrue(PalindromeChecker.checkPalindrome("А роза упала на лапу Азора"));
        assertTrue(PalindromeChecker.checkPalindrome("Я - арка края"));
    }

    @Test
    public void testNonPalindromeWithNormalInput() {
        assertFalse(PalindromeChecker.checkPalindrome("hello"));
        assertFalse(PalindromeChecker.checkPalindrome("banan"));
        assertFalse(PalindromeChecker.checkPalindrome("Java is (not) fun"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeChecker.checkPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(PalindromeChecker.checkPalindrome("a"));
        assertTrue(PalindromeChecker.checkPalindrome("A"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(PalindromeChecker.checkPalindrome("12321"));
        assertFalse(PalindromeChecker.checkPalindrome("12345"));
    }
}
