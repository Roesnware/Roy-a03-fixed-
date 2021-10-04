import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void checkDigitsTest() {
        Solution32 sol = new Solution32();

        String str = "122";
        boolean ans = sol.checkDigits(str);
        assertTrue(sol.checkDigits(str));
    }
}