package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test extends TestCase {
    private final Solution2 solution = new Solution2();
    @Test
    public void testRemoveDuplicateLetters() {
        // Test case 1: Basic test with duplicates
        assertEquals("abc", solution.removeDuplicateLetters("bcabc"));

        // Test case 2: All characters the same
        assertEquals("a", solution.removeDuplicateLetters("aaaaa"));

        // Test case 3: No duplicates
        assertEquals("abcdef", solution.removeDuplicateLetters("abcdef"));

        // Test case 4: Mixed characters
        assertEquals("abcde", solution.removeDuplicateLetters("bcabcabcde"));

        // Test case 5: Edge case - empty string
        assertEquals("", solution.removeDuplicateLetters(""));

        // Test case 6: Edge case - single character
        assertEquals("a", solution.removeDuplicateLetters("a"));

        // Test case 7: Long input with random duplicates
        assertEquals("abcde", solution.removeDuplicateLetters("edcbaabcde"));

        // Test case 8: Input with random order and duplicates
        assertEquals("abc", solution.removeDuplicateLetters("bcabcabcabcabc"));

        // Test case 9: Large input with alternating characters
        assertEquals("ab", solution.removeDuplicateLetters("abababababababababababababab"));
    }
}