package ch.noah;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public static void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(15, calculator.summe(5, 10));
    }

    @Test
    public void shouldAddNegativeNumbers() {
        assertEquals(-15, calculator.summe(-5, -10));
    }

    @Test
    public void shouldAddOneNegativeNumber() {
        assertEquals(8, calculator.summe(10, -2));
    }

    @Test
    public void shouldAddNegativeAndZero() {
        assertEquals(-5, calculator.summe(0, -5));
    }

    @Test
    public void shouldOverflowWhenValueToBig() {
        assertEquals(Integer.MIN_VALUE + 11, calculator.summe(Integer.MAX_VALUE, 12));
    }

    @Test
    public void shouldUnderflowWhenValueToSmall() {
        assertEquals(Integer.MAX_VALUE - 11, calculator.summe(Integer.MIN_VALUE, -12));
    }

    @Test
    public void shouldAddMaxValueAndZero() {
        assertEquals(Integer.MAX_VALUE, calculator.summe(Integer.MAX_VALUE, 0));
    }

    @Test
    public void shouldAddMinValueAndZero() {
        assertEquals(Integer.MIN_VALUE, calculator.summe(Integer.MIN_VALUE, 0));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void shouldSubtractTwoNegativeNumbers() {
        assertEquals(-5, calculator.subtract(-10, -5));
    }

    @Test
    public void shouldSubtractOneNegativeNumber() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void shouldSubtractTwoPositiveNumbers() {
        assertEquals(9, calculator.subtract(19, 10));
    }

    @Test
    public void shouldSubtractPositiveNumberByZero() {
        assertEquals(10, calculator.subtract(10, 0));
    }

    @Test
    public void shouldSubtractNegativeNumberByZero() {
        assertEquals(-10, calculator.subtract(-10, 0));
    }

    @Test
    public void shouldSubtractZeroByNegativeNumber() {
        assertEquals(10, calculator.subtract(0, -10));
    }

    @Test
    public void shouldSubtractZeroByPositiveNumber() {
        assertEquals(-10, calculator.subtract(0, 10));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(2, calculator.division(4, 2));
    }

    @Test
    public void shouldDivideTwoNegativeNumbers() {
        assertEquals(2, calculator.division(-4, -2));
    }

    @Test
    public void shouldDivideOneNumber() {
        assertEquals(-2, calculator.division(-4, 2));
    }

    @Test
    public void shouldDivideByNegativeNumber() {
        assertEquals(-2, calculator.division(4, -2));
    }

    @Test
    public void shouldRoundDownWards() {
        assertEquals(1, calculator.division(3, 2));
    }

    @Test
    public void shouldDivideZero() {
        assertEquals(0, calculator.division(0, 2));
    }

    @Test
    public void shouldDivideMaxValue() {
        assertEquals(1, calculator.division(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void shouldDivideMinValue() {
        assertEquals(1, calculator.division(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowWhenDividingByZero() {
        calculator.division(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowWhenDividingNegativeNumberByZero() {
        calculator.division(-11, 0);
    }

    @Test
    public void shouldThrowExceptionWhenStringArePassed() {
        assertThatThrownBy(() -> calculator.multiplication("as", "1")).isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("For input string: \"as\"");
    }

    @Test
    public void shouldMultiplyWhenNumbersArePassed() {
        assertThat(calculator.multiplication("2", "3")).isEqualTo(6);
    }

}
