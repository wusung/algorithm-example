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

    public void testGcd() throws Exception {
        assertEquals(1, Math.gcd(1, 2));
        assertEquals(2, Math.gcd(2, 6));
        assertEquals(10, Math.gcd(100, 10));
        assertEquals(10, Math.gcd(10, 100));
    }
}