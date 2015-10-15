package com.example.algorithm.ch01;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author Green
 * @since 2015/10/15
 */
public class Rolls {
    public static void main(String[] args) {
        int T = Integer.valueOf(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        for (int i = 0; i < T; i++) {
            rolls[StdRandom.uniform(1, SIDES+1)].increase();
        }
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
