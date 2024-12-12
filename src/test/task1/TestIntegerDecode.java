package test.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestIntegerDecode {

    @Test
    void testSimpleDecimal() {
        assertEquals(777, Integer.decode("777"));
    }

    @Test
    void testHexadecimal() {
        assertEquals(77, Integer.decode("0x4D"));
    }

    @Test
    void testOctal() {
        assertEquals(7, Integer.decode("021"));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-777, Integer.decode("-777"));
    }

    @Test
    void testInvalidString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("abc"));
    }

    @Test
    void testOverflow() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("9999999999"));
    }

    @Test
    void testEmptyString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }

    @Test
    void testNullArgument() {
        assertThrows(NullPointerException.class, () -> Integer.decode(null));
    }
}