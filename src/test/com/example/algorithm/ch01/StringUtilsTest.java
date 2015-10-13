package com.example.algorithm.ch01;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Green
 * @since 2015/10/14
 */
public class StringUtilsTest extends TestCase {

    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(StringUtils.isPalindrome("11"));
        assertTrue(StringUtils.isPalindrome("123321"));
        assertTrue(StringUtils.isPalindrome("12344321"));
        assertFalse(StringUtils.isPalindrome("12"));
        assertFalse(StringUtils.isPalindrome("12:1234"));
    }
}