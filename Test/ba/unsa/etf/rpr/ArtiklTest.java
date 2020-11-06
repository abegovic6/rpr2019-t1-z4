package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {

    @Test
    void testKonstruktoraiGetera () {
        Artikl a = new Artikl("naziv", 1000, "1234");
        assertEquals("naziv", a.getNaziv());
        assertEquals(1000, a.getCijena());
        assertEquals("1234", a.getKod());
    }
}