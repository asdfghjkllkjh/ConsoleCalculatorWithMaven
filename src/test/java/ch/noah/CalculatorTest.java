package ch.noah;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void setCalculator () {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers () {
        assertEquals(15, calculator.summe(5,10));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(5, calculator.subtraktion(10, 5));
    }
}
