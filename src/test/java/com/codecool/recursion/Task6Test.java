package com.codecool.recursion;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class Task6Test {

    @Test
    void fibonacchi() {
        Task6 sut = new Task6();

        assertEquals(1, sut.fibonacchi(1));
        assertEquals(1, sut.fibonacchi(2));
        assertEquals(2, sut.fibonacchi(3));
        assertEquals(3, sut.fibonacchi(4));
        assertEquals(5, sut.fibonacchi(5));
        assertEquals(8, sut.fibonacchi(6));
        assertEquals(13, sut.fibonacchi(7));

        assertEquals(6765, sut.fibonacchi(20));
    }

    @Test
    @Disabled
    void fibonacchiNaiveShouldBeSlow() {
        assertTimeoutPreemptively(ofSeconds(5), () -> {
            Task6 sut = new Task6();
            assertEquals(12586269025L, sut.fibonacchi(50));
        });
    }

    @Test
    @Disabled
    void fibonacchiNaiveShouldThrowStackOverflowError() {
        assertTimeoutPreemptively(ofSeconds(5), () -> {
            Task6 sut = new Task6();
            assertEquals(308061521170129L, sut.fibonacchi(71));
        });
    }
}