package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("A", 1000, "1234"));
        s.dodajArtikl(new Artikl("A", 1000, "1234"));
        s.dodajArtikl(new Artikl("A", 1000, "1234"));

        assertEquals(3, s.getBroj_artikala());
    }

    @Test
    void dodajArtikl1() {
        Supermarket s = new Supermarket();
        for(int i = 0; i < 50; i++) {
            s.dodajArtikl(new Artikl("A", 1000, "1234"));
        }
        assertEquals(50, s.getBroj_artikala());

    }



    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("A", 1000, "1234"));
        s.dodajArtikl(new Artikl("A", 1000, "1235"));
        s.dodajArtikl(new Artikl("A", 1000, "1235"));

        Artikl a = s.izbaciArtiklSaKodom("1237");

        assertEquals(3, s.getBroj_artikala());
        assertEquals(null, a);
    }
}