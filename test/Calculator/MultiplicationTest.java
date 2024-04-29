package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(6, multiplication.calculate(2, 3), "2 * 3 should equal 6");
    }
}
