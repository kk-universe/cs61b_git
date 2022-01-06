package Flik;
import static org.junit.Assert.*;

import org.junit.Test;
public class Fliktest {
    @Test
    public void testisSameNumber() {
        Integer a = 10;
        Integer b = 10;
        Integer c = 11;
        assertEquals(a, b);
        assertNotEquals(b, c);
    }

}
