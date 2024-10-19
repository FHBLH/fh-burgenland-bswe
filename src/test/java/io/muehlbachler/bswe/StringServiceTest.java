package io.muehlbachler.bswe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private final StringService stringService = new StringService();

    @Test
    public void testToUpperCase() {
        assertEquals("ABC", stringService.toUpperCase("abc"));
    }

    @Test
    public void testToUpperCaseWithEmptyString() {
        assertEquals("", stringService.toUpperCase(""));
    }

    @Test
    public void testToUpperCaseWithNull() {
        assertNull(stringService.toUpperCase(null));
    }
    // FIXME: implement more tests
}
