import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateFirstNameTest() {
        Solution27 sol = new Solution27();
        String first = "a";
        boolean ans = sol.validateFirstName(first);
        assertFalse(ans);
    }

    @Test
    void validateLastNameTest() {
        Solution27 sol = new Solution27();
        String last = "b";
        boolean ans = sol.validateLastName(last);
        assertFalse(ans);
    }


    @Test
    void validateZipCodeTest() {
        Solution27 sol = new Solution27();
        String zip = "123456";
        boolean ans = sol.validateZipCode(zip);
        assertFalse(ans);
    }

    @Test
    void validateZipCodeTest2() {
        Solution27 sol = new Solution27();
        String zip = "abcde";
        boolean ans = sol.validateZipCode(zip);
        assertFalse(ans);
    }

    @Test
    void validateEmployeeIDTest() {
        Solution27 sol = new Solution27();
        String zip = "ab-cdef";
        boolean ans = sol.validateZipCode(zip);
        assertFalse(ans);
    }
}