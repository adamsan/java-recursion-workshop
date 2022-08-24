package com.codecool.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {
    private Task2 sut;

    @BeforeEach
    void setUp() {
        sut = new Task2();
    }

    @Test
    void sumZero() {
        assertEquals(0, sut.sum(0));
    }

    @Test
    void sumOne() {
        assertEquals(1, sut.sum(1));
    }

    @Test
    void sumFive() {
        assertEquals(1 + 2 + 3 + 4 + 5, sut.sum(5));
    }

}