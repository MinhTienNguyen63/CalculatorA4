package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void testDivision() {
        Division division = new Division();
        assertEquals(2, division.calculate(4, 2), "4 / 2 should equal 2");
    }

    @Test
    public void testDivisionByZero() {
        Division division = new Division();
        assertThrows(ArithmeticException.class, () -> division.calculate(1, 0), "Division by zero should throw an ArithmeticException");
    }
}
