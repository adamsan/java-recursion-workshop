package com.codecool.recursion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    PrintStream outTmp;
    private Task1 sut;
    private ByteArrayOutputStream testOutput;

    @BeforeEach
    void setup() {
        outTmp = System.out;
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        sut = new Task1();
    }

    @AfterEach
    void teardown() {
        System.setOut(outTmp);
    }

    @Test
    void printAllPrintsNothingWhenPassedEmptyArray() {
        sut.printAll(new String[]{});
        assertEquals(0, testOutput.toByteArray().length);
    }

    @Test
    void printAllPrintsAllStringsPassedIn() {
        sut.printAll(new String[]{});
        String[] input = {"apple", "orange", "banana", "grapes"};

        var sep = System.lineSeparator();
        String expected = "apple" + sep +
                "orange" + sep +
                "banana" + sep +
                "grapes" + sep;

        sut.printAll(input);
        String actual = new String(testOutput.toByteArray());
        assertEquals(expected, actual);
    }
}