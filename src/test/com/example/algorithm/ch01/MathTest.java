package com.example.algorithm.ch01;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Green on 2015/09/12.
 */
public class MathTest extends TestCase {

    @Test
    public void testAbs() throws Exception {
        assertEquals(Math.abs(-1), 1);
        assertEquals(Math.abs(1), 1);
    }

    @Test
    public void testAbs1() throws Exception {

    }

    @Test
    public void testIsPrime() throws Exception {
        assertTrue(Math.isPrime(2));
        assertTrue(Math.isPrime(3));
        assertFalse(Math.isPrime(4));
        assertTrue(Math.isPrime(5));
        assertFalse(Math.isPrime(6));
        assertTrue(Math.isPrime(7));
        assertFalse(Math.isPrime(8));
        assertFalse(Math.isPrime(9));
    }
}