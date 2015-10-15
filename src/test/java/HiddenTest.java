import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HiddenTest extends Main {
    @Test
    public void toBinaryStringTest() {
        for (int i = 10; i <= 10000; i += 10)
            assertEquals(Integer.toBinaryString(i), toBinaryString(i));
    }
}
