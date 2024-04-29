package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    public void testAddition() {
        Addition addition = new Addition();
        assertEquals(5, addition.calculate(2, 3), "2 + 3 should equal 5");
    }
}
