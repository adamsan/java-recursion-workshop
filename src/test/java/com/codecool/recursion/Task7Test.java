package com.codecool.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task7Test {
    Task7 sut = new Task7();

    @Test
    void mergeTestSimpleInput() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{5, 6, 7};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, sut.merge(a, b));
    }

    @Test
    void mergeTestSimpleInputReversed() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{5, 6, 7};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, sut.merge(b, a));
    }

    @Test
    void mergeTest() {
        int[] a = new int[]{1, 5, 7, 12};
        int[] b = new int[]{3, 8, 9, 20};
        int[] expected = new int[]{1, 3, 5, 7, 8, 9, 12, 20};
        assertArrayEquals(expected, sut.merge(a, b));
    }

    @Test
    void mergeTestOneArrayIsEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{5, 6, 7};
        int[] expected = new int[]{5, 6, 7};
        assertArrayEquals(expected, sut.merge(a, b));
    }


    @Test
    void mergeSortTest() {
        int[] numbers = {3, 4, 7, 6, 1, 8, 10, 5, 2};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        assertArrayEquals(expected, sut.mergeSort(numbers));
    }
}