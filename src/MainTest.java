import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

class MainTest {
    private final Main testing = new Main();

    OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    @Test
    void testFullDate () {
        String testing2 = testing.fullFormat(date);
        assertEquals("venerdì 1 marzo 2002",testing2);
    }
    @Test
    void testMediumlDate () {
        String testing2 = testing.mediumFormat(date);
        assertEquals("1 mar 2002",testing2);
    }
    @Test
    void testShortDate () {
        String testing2 = testing.shortFormat(date);
        assertEquals("01/03/02",testing2);
    }
}