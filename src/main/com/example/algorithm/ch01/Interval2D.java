package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author Green
 * @since 2015/10/15
 */
public class Interval2D {
    public static void main(String[] args) {
        double xlo = Double.valueOf(args[0]);
        double xhi = Double.valueOf(args[1]);
        double ylo = Double.valueOf(args[2]);
        double yhi = Double.valueOf(args[3]);

        int T = Integer.valueOf(args[4]);

        Interval1D x = new Interval1D(xlo, xhi);
        Interval1D y = new Interval1D(ylo, yhi);
        edu.princeton.cs.algs4.Interval2D box = new edu.princeton.cs.algs4.Interval2D(x, y);
        box.draw();

        Counter hits = new Counter("hits");
        for (int i = 0; i < T; i++) {
            double x1 = java.lang.Math.random();
            double y1 = java.lang.Math.random();
            Point2D p = new Point2D(x1, y1);
            if (box.contains(p)) {
                hits.increase();
            } else {
                p.draw();
            }
        }
        StdOut.println(hits);
        StdOut.println(box.area());
    }
}
