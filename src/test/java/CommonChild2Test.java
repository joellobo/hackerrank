import other.App2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonChild2Test {

    @Test
    void commonChild() {
        assertEquals("BEJ", App2.commonChild("ABCDEFGHIJKL", "POXBEZJXY"));
        ;
    }
}