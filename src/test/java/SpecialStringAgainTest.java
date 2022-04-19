import interviewpreparationkit.stringmanipulation.SpecialStringAgain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialStringAgainTest {

    private String input = "asasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaaasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdasasdaaaaaaaaaa";

    @Test
    void substrCount() {
        assertEquals(1900, SpecialStringAgain.substrCount(1000, input));
    }

    @Test
    void substrCountSizeZero() {
        assertEquals(0, SpecialStringAgain.substrCount(0, ""));
    }

    @Test
    void substrCountSizeUm() {
        assertEquals(1, SpecialStringAgain.substrCount(1, "a"));
    }

    @Test
    void substrCount2() {
        assertEquals(5, SpecialStringAgain.substrCount(4, "aabc"));
    }

}