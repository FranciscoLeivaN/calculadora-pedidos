package com.ejemplo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoServiceTest {

    DescuentoRepository repository = new DescuentoRepository();
    PedidoService service = new PedidoService(repository);

    @Test
    @Disabled
    void testSinDescuentoYEnvioNormal() {
        double total = service.calcularTotal(100, "", false);
        assertEquals(110.0, total);
    }    
    
    @Test
    @Disabled
    void testConDescuentoYEnvioExpress() {
        double total = service.calcularTotal(100, "PROMO10", true);
        assertEquals(110.0, total); // 100 - 10% + 20
    }     
    
    @Test
    @Disabled
    void testConDescuentoYEnvioNormal() {
        double total = service.calcularTotal(200, "PROMO10", false);
        assertEquals(190.0, total);
    }

    @Test
    @Disabled
    void testSinDescuentoYEnvioExpress() {
        double total = service.calcularTotal(150, "", true);
        assertEquals(170.0, total);
    }

}
