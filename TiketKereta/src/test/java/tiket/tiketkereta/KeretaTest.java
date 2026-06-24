package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeretaTest {

    @Test
    public void testKeretaInitializationAndGetters() {
        Stasiun sB = new Stasiun("Gambir", "Jakarta");
        Stasiun sT = new Stasiun("Gubeng", "Surabaya");
        Jadwal jadwal = new Jadwal("08:00", "17:00");
        Kereta kereta = new Kereta("Argo Bromo Anggrek", 100000, 200000, 300000, sB, sT, jadwal);

        assertEquals("Argo Bromo Anggrek", kereta.getNama());
        assertNotNull(kereta.getTipeKelas("Ekonomi"));
        assertEquals(100000, kereta.getTipeKelas("Ekonomi").getHarga());
        assertEquals(200000, kereta.getTipeKelas("Bisnis").getHarga());
        assertEquals(300000, kereta.getTipeKelas("Eksekutif").getHarga());
    }

    @Test
    public void testIsOnRoute() {
        Stasiun sB = new Stasiun("Gambir", "Jakarta");
        Stasiun sT = new Stasiun("Gubeng", "Surabaya");
        Jadwal jadwal = new Jadwal("08:00", "17:00");
        Kereta kereta = new Kereta("Argo Bromo Anggrek", 100000, 200000, 300000, sB, sT, jadwal);

        assertTrue(kereta.isOnRoute("Jakarta", "Surabaya"));
        assertFalse(kereta.isOnRoute("Jakarta", "Bandung"));
        assertFalse(kereta.isOnRoute("Bandung", "Surabaya"));
    }
}
