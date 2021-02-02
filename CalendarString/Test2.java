import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
//Checking if the test dates are equal to the actual days of the months. Expected and actual.
class Test2 {
    @Test
    void testDayOfWeek() {
        assertEquals("Monday",
                Main.dayOfWeek(9, 30, 2019));
        assertEquals("Tuesday",
                Main.dayOfWeek(6, 9, 1998));
        assertEquals("Monday",
                Main.dayOfWeek(5, 10, 1999));
        assertEquals("Sunday",
                Main.dayOfWeek(4, 16, 1995));
        assertEquals("Monday",
                Main.dayOfWeek(4, 24, 1972));
    }
}