package com.example.algorithm.ch01;

/**
 * Created by Green on 2015/09/07.
 */
public class Algorithm {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
