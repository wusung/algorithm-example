package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.lang.*;

/**
 * @author Green
 * @since 2015/10/14
 */
public class Flips {
    public static void main(String[] args) {
        int T = Integer.valueOf(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < T; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increase();
            } else {
                tails.increase();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta:" + java.lang.Math.abs(d));
    }
}
