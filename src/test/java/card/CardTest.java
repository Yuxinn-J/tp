package card;

import data.card.Card;
import org.junit.jupiter.api.Assertions;


class CardTest {
    public void testOutput() {
        Assertions.assertEquals(new Card("loop"), "loop");
    }
}