package com.example.algorithm.ch01;

/**
 * Created by Green on 2015/09/12.
 */
public class Math {

    /**
     * 最大公約數
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        return gcd(q, p%q);
    }

    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }

     public static boolean isPrime(int N) {
        if (N < 2)
            return false;
        for (int i = 2; i*i <= N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
}
