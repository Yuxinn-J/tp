package card;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    public void testOutput() {
        Assertions.assertEquals(new Card("loop", 1), "loop");
    }
}