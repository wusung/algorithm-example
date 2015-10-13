package com.example.algorithm.ch01;

/**
 * @author Green
 * @since 2015/10/13
 */
public class SequenceSearch {
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }
}
