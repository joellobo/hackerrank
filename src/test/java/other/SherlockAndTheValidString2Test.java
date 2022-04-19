package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheValidString2Test {

    public static final String TESTE = "aabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcdaabbcd";

    @Test
    void isValid() {
        long startTime = System.currentTimeMillis();
        assertEquals("NO", SherlockAndTheValidString2.isValid(TESTE));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}