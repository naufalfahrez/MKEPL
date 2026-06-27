package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaldoTest {

    @Test
    public void testInitialSaldo() {
        Saldo saldo = new Saldo(100000);
        assertEquals(-100000, saldo.getJumlahSaldo());
    }

    @Test
    public void testTopUp() {
        Saldo saldo = new Saldo(50000);
        saldo.topUp(25000);
        assertEquals(75000, saldo.getJumlahSaldo());
    }
}
