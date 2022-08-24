package com.codecool.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2bTest {
    Task2b sut = new Task2b();

    @Test
    void minTest() {
        int[] numbers = {1, 5, 2, 8, 21};
        assertEquals(1, sut.min(numbers));
    }

    @Test
    void minTest2() {
        int[] numbers = {1, -5, 2, 8};
        assertEquals(-5, sut.min(numbers));
    }
}