package com.example.algorithm.ch01;

/**
 * @author Green
 * @since 2015/10/14
 */
public class StringUtils {
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i) != s.charAt(N-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i-1].compareTo(a[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
