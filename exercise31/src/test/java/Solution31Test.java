import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void checkDigitsTest() {
        Solution31 sol = new Solution31();
        String str = "65";
        assertTrue(sol.checkDigits(str));
    }
}