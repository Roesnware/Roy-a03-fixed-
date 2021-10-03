import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void getSum() {
        Solution28 sol = new Solution28();
        int sum = 0;
        int num = 12;
        int ans = sol.getSum(num, sum);
        int expected = 12;
        assertEquals(expected,ans);
    }
}
