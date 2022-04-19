package other;

import org.junit.jupiter.api.Test;
import algorithms.string.SherlockAndTheValidString;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheValidStringTest {

    @org.junit.jupiter.api.Test
    void isValid() {
        long startTime = System.currentTimeMillis();
        assertEquals("NO", SherlockAndTheValidString.isValid("aabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcd"));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    @Test
    void testIsValid() {
    }

    @Test
    void testIsValid1() {
    }
}