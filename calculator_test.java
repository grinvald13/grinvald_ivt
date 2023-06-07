import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest_1 {

    private Calculator underTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        underTest = new Calculator();
    }
    @org.junit.jupiter.api.Test
    void sum() {
        final int first = 1;
        final int second = 2;
        final int result = 3;

        final int actualresult = underTest.sum(first, second);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        final int first = 2;
        final int second = 2;
        final int result = 0;

        final int actualresult = underTest.subtract(first, second);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        final int first = 2;
        final int second = 2;
        final int result = 4;

        final int actualresult = underTest.multiply(first, second);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        final int first = 2;
        final int second = 0;

        assertThrows(IllegalArgumentException.class, () -> underTest.divide(first, second));
    }

    @org.junit.jupiter.api.Test
    void squareRoot(){
        final int number = 144;
        final double result = 12;

        final double actualresult = underTest.squareRoot(number);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void squared_1() {
        final int number = 4;
        final double result = 16;

        final double actualresult = underTest.squared_1(number);

        assertEquals(actualresult, result);
    }

    @org.junit.jupiter.api.Test
    void squared_2() {
        final int first = 2;
        final int second = 6;
        final double result = 64;

        final double actualresult = underTest.squared_2(first, second);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void ln() {
        final double number = 2.7182818284590452353602874713527;
        final double result = 1;

        final double actualresult = underTest.ln(number);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void abs() {
        final double number = -4;
        final int result = 4;

        final double actualresult = underTest.abs(number);

        assertEquals(result, actualresult);
    }

    @org.junit.jupiter.api.Test
    void factorialis() {
        final int number = 5;
        final int result = 120;

        final double actualresult = underTest.factorialis(number);

        assertEquals(result, actualresult);
    }
}
