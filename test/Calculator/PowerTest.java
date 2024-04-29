package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void testPower() {
        Power power = new Power();
        assertEquals(16, power.calculate(2, 4), "2 ^ 4 should equal 16");
    }
}
