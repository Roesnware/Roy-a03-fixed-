import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    boolean getMonthsTest() {
        Solution26 sol = new Solution26();
        int ans = sol.getMonths(5000, 12, 200);
        int expected = 70;
        return (ans==expected);
    }
}