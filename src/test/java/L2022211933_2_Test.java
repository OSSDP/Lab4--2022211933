import org.example.Solution;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 单元测试类，用于测试 Solution 类的 removeDuplicateLetters 方法
 * 测试用例设计原则：等价类划分
 */
public class L2022211933_2_Test {

    /**
     * 测试目的：测试对包含重复字母的字符串去重的情况
     * 测试用例：输入包含重复字母的字符串，例如 "bcabc"，"cbacdcbc" 等
     */
    @Test
    public void testRemoveDuplicateLettersWithDuplicates() {
        Solution solution = new Solution();
        String input1 = "bcabc";
        String input2 = "cbacdcbc";
        assertEquals("abc", solution.removeDuplicateLetters(input1));
        assertEquals("acdb", solution.removeDuplicateLetters(input2));
    }

    /**
     * 测试目的：测试对不包含重复字母的字符串处理的情况
     * 测试用例：输入不包含重复字母的字符串，例如 "abcdef"，"xyzyx" 等
     */
    @Test
    public void testRemoveDuplicateLettersWithoutDuplicates() {
        Solution solution = new Solution();
        String input1 = "abcdef";
        String input2 = "xyzyx";
        assertEquals("abcdef", solution.removeDuplicateLetters(input1));
        assertEquals("xyz", solution.removeDuplicateLetters(input2));
    }
    //测试
}
