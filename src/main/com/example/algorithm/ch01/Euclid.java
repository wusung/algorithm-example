package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author Green
 * @since 2015/10/13
 */
public class Euclid {

    public static void main(String[] args) {
        int p = Integer.valueOf(args[0]);
        int q = Integer.valueOf(args[0]);
        StdOut.print("Result=" + Math.gcd(p, q));
    }
}
