package com.example.algorithm.ch01;

/**
 * Created by Green on 2015/09/07.
 */
public class Accumulator {

    private double total;

    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean " + N + " values:" + String.format("%7.5f", mean());
    }
}
