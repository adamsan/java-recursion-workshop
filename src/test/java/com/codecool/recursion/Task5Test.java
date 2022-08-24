package com.codecool.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {

    @Test
    void factorialTest() {
        var sut = new Task5();

        assertEquals(1, sut.factorial(0));
        assertEquals(1, sut.factorial(1));
        assertEquals(2, sut.factorial(2));
        assertEquals(6, sut.factorial(3));
        assertEquals(24, sut.factorial(4));
        assertEquals(120, sut.factorial(5));
    }
}