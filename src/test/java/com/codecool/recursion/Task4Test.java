package com.codecool.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    Task4 sut = new Task4();

    @Test
    void isPalindromeEmpty() {
        assertTrue(sut.isPalindrome(""));
    }

    @Test
    void isPalindromeSimple() {
        assertTrue(sut.isPalindrome("a"));
    }

    @Test
    void isPalindromeNotPalindrome() {
        assertFalse(sut.isPalindrome("acdc"));
        assertFalse(sut.isPalindrome("europe"));
    }

    @Test
    void isPalindromeShortWords() {
        assertTrue(sut.isPalindrome("abba"));
        assertTrue(sut.isPalindrome("tattarrattat"));
    }
}