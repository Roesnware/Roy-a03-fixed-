import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void checkDigits() {
        Solution25 sol = new Solution25();
        String str1 = "123456789";
        int strLen = str1.length();

        boolean val;
        val = sol.checkDigits(str1, strLen);
        assertFalse(val);
    }

    @Test
    void checkLetters() {
        Solution25 sol = new Solution25();
        String str1 = "abcd12";
        int strLen = str1.length();

        boolean val;
        val = sol.checkDigits(str1, strLen);
        assertFalse(val);
    }

    @Test
    void checkDigLet() {
        Solution25 sol = new Solution25();
        String str1 = "abcd!12345";
        int strLen = str1.length();

        boolean val;
        val = sol.checkDigits(str1, strLen);
        assertFalse(val);
    }

    @Test
    void checkAll() {
        Solution25 sol = new Solution25();
        String str1 = "abcd!";
        int strLen = str1.length();

        boolean val;
        val = sol.checkDigits(str1, strLen);
        assertFalse(val);
    }

}