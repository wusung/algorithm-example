package com.example.algorithm.ch01;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Green
 * @since 2015/10/13
 */
public class ArraysTest extends TestCase {

    @Test
    public void testMax() throws Exception {
        double a[] = { 1, 2, 3, 5};
        TestCase.assertEquals(5d, Arrays.max(a));
    }

    @Test
    public void testAvearage() throws Exception {
        double a[] = { 1, 2, 3, 5};
        TestCase.assertEquals(2.75d, Arrays.avearage(a));
    }

    @Test
    public void testReverse() throws Exception {
        double a[] = { 1, 2, 3, 5};
        Arrays.reverse(a);
        assertEquals(5d, a[0]);
        assertEquals(3d, a[1]);
        assertEquals(2d, a[2]);
        assertEquals(1d, a[3]);
    }
}