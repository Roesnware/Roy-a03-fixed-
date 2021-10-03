import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void checkDig() {
        Solution29 sol = new Solution29();
        int size = 1;
        String rate = "4";
        boolean ans = sol.checkDig(rate,size);
        assertTrue(ans);
    }

    @Test
    void getInvestment() {
        Solution29 sol = new Solution29();
        int rate = 4;
        int ans = sol.getInvestment(rate);
        int expected = 18;
        assertEquals(expected,ans);
    }
}