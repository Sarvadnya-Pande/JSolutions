package Strings;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverse() {
        assertEquals(StringManipulator.reverse(""), "");
        assertEquals(StringManipulator.reverse("hello"), "olleh");
        assertEquals(StringManipulator.reverse("sarvadnya"), "ayndavras");
        assertEquals(StringManipulator.reverse("esrever"), "reverse");
    }
}