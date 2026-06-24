package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StasiunTest {

    @Test
    public void testStasiunGetters() {
        Stasiun stasiun = new Stasiun("Gambir", "Jakarta");
        assertEquals("Gambir", stasiun.getNama_stasiun());
        assertEquals("Jakarta", stasiun.getKota());
    }

    @Test
    public void testStasiunToString() {
        Stasiun stasiun = new Stasiun("Gubeng", "Surabaya");
        assertEquals("Stasiun Gubeng, Surabaya", stasiun.toString());
    }
}
