package com.codecool.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {
    private Task3 sut = new Task3();

    @Test
    void sumZero() {
        int actual = sut.sum(new int[]{});
        assertEquals(0, actual);
    }

    @Test
    void sumZeroSum() {
        int actual = sut.sum(new int[]{-4, 4, 0});
        assertEquals(0, actual);
    }

    @Test
    void sumNumbers1() {
        int actual = sut.sum(new int[]{1, 2, 3});
        assertEquals(6, actual);
    }

    @Test
    void sumNumbers2() {
        int actual = sut.sum(new int[]{10, 41, 8});
        assertEquals(59, actual);
    }
}