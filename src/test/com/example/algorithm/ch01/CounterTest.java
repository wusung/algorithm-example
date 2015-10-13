package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Green
 * @since 2015/10/12
 */
public class CounterTest extends TestCase {

    @Test
    public void testIncrease() throws Exception {

    }

    @Test
    public void testTally() throws Exception {
        int T = 10;
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < T; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increase();
            }
            else {
                tails.increase();
            }
        }
        StdOut.println(heads);
        assertEquals("5 heads", heads);
        StdOut.println(tails);
        assertEquals("3 tails", tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));
        assertEquals(4, d);
    }
}