import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isAnagramTest {

    @Test
    void isAnagram() {
        String str1 = "note";
        String str2 = "tone";
        Solution24 sol = new Solution24();

        boolean val;
        val = sol.isAnagram(str1, str2);
        assertTrue(val);
    }
}