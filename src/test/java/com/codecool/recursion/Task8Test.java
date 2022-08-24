package com.codecool.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void testBinaryTreeContains() {
        BinaryTree tree = new BinaryTree();
        assertFalse(tree.contains(3));
        assertFalse(tree.contains(6));
        assertFalse(tree.contains(7));
        assertFalse(tree.contains(8));
        assertFalse(tree.contains(12));

        tree.addAll(3, 6, 7, 8, 12);

        assertTrue(tree.contains(3));
        assertTrue(tree.contains(6));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(8));
        assertTrue(tree.contains(12));
        assertFalse(tree.contains(-1));
        assertFalse(tree.contains(9));
        assertFalse(tree.contains(13));
    }

    @Test
    void testBinaryTreeDepthLinearTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.findDepth());
        tree.add(1);
        assertEquals(1, tree.findDepth());
        tree.add(2);
        assertEquals(2, tree.findDepth());
        tree.add(3);
        assertEquals(3, tree.findDepth());
        tree.add(4);
        assertEquals(4, tree.findDepth());
    }

    @Test
    void testBinaryTreeDepthRealTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.findDepth());
        tree.add(4);
        assertEquals(1, tree.findDepth());
        tree.add(2);
        assertEquals(2, tree.findDepth());
        tree.add(8);
        assertEquals(2, tree.findDepth());
        tree.add(1);
        assertEquals(3, tree.findDepth());
        tree.add(3);
        assertEquals(3, tree.findDepth());
    }


    @Test
    void testBinaryTreeGetContent() {
        BinaryTree tree = new BinaryTree();
        tree.addAll(13, 3, 6, 7, 8);
        List<Integer> numbers = tree.getContent();
        assertEquals(List.of(3, 6, 7, 8, 13), numbers);
    }
}