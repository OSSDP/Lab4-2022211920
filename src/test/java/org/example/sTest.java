package org.example; /**测试用例设计是软件测试过程中的重要环节，良好的测试用例可以有效提高测试的覆盖率和效率。以下是一些常用的测试用例设计原则：
        1. 等价类划分原则
        2. 边界值分析原则
        3. 错误推测原则
        4. 状态转换测试原则
        5. 场景测试原则
        6. 组合测试原则
        7. 最小化测试原则
        8. 可重复性原则
        9. 可追溯性原则
        10. 用户视角原则
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class sTest {

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
