package com.example.algorithm.ch01;

/**
 * Created by Green on 2015/09/07.
 */
public class Counter {

    private final String name;
    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increase() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }
}
