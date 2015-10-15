import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest extends Main {
    @Test
    public void toBinaryStringTest() {
        assertEquals("1", toBinaryString(1));
        assertEquals("10", toBinaryString(2));
        assertEquals("11", toBinaryString(3));
        assertEquals("100", toBinaryString(4));
    }
}
