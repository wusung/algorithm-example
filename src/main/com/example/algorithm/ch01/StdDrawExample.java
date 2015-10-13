package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author Green
 * @since 2015/10/13
 */
public class StdDrawExample {

    public static void main(StringUtils[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 0; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i * java.lang.Math.log(i));
        }
    }
}
