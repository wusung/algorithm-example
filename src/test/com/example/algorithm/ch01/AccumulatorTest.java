package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdRandom;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Green
 * @since 2015/09/07
 */
public class AccumulatorTest extends TestCase {


    @Test
    public void testAddDataValue() throws Exception {
        int T = 1000;


        Accumulator a = new Accumulator();
        for (int i = 0; i < T; i++) {
            a.addDataValue(StdRandom.uniform(0, 1));
        }

    }

    public void testMean() throws Exception {

    }

    public void testToString() throws Exception {

    }
}