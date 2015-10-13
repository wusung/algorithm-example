package com.example.algorithm.ch01;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Green
 * @since 2015/10/13
 */
public class BinarySearchTest extends TestCase {

    @Test
    public void testRank() throws Exception {
        assertEquals(3, BinarySearch.rank(4, new int[]{1, 2, 3, 4, 5}));
        assertEquals(4, BinarySearch.rank(5, new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, BinarySearch.rank(10, new int[]{1, 2, 3, 4, 5}));
    }

    public void testRank2() throws Exception {
        assertEquals(3, BinarySearch.rank2(4, new int[]{1, 2, 3, 4, 5}));
        assertEquals(4, BinarySearch.rank2(5, new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, BinarySearch.rank2(10, new int[]{1, 2, 3, 4, 5}));
    }
}