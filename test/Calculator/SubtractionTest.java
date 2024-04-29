package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractionTest {
    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(-1, subtraction.calculate(2, 3), "2 - 3 should equal -1");
    }
}
