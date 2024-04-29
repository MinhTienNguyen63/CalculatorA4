import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    private Calc calculator;

    @BeforeEach // Corrected from @Before to @BeforeEach
    public void setUp() {
        calculator = new Calc();
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2, 3), 0.001, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calculator.subtract(2, 3), 0.001, "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.001, "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001, "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    public void testPower() {
        assertEquals(16.0, calculator.power(2, 4), 0.001, "Power test failed");
    }
}
