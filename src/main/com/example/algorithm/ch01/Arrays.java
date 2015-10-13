package com.example.algorithm.ch01;

/**
 * @author Green
 * @since 2015/10/13
 */
public class Arrays {

    public static double max(double a[]) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static double avearage(double a[]) {
        int N = a.length;
        double sum = 0d;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        return sum / N;
    }

    public static void reverse(double a[]) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - i - 1] = temp;
        }
    }
}
