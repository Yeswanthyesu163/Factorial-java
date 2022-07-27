import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void ShouldReturnOneForFactorialOfZero() {
        Number number = new Number(0);
        int factorial = number.computeFactorial();
        assertEquals(factorial, 1);
    }

    @Test
    void ShouldReturnOneForFactorialOfOne() {
        Number number = new Number(1);
        int factorial = number.computeFactorial();
        assertEquals(factorial, 1);
    }

    @Test
    void ShouldReturnMinusOneForFactorialOfNegativeNumbers() {
        Number number = new Number(-2);
        int factorial = number.computeFactorial();
        assertEquals(factorial,-1);
    }

    @Test
    void ShouldReturnFactorialOfPositiveNumbers() {
        Number number = new Number(5);
        int factorial = number.computeFactorial();
        assertEquals(factorial, 120);
    }
}