package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("A", 1000, "1234"));
        k.dodajArtikl(new Artikl("A", 1000, "1234"));
        k.dodajArtikl(new Artikl("A", 1000, "1234"));

        assertEquals(3, k.getBroj_artikala());
    }

    @Test
    void dodajArtikl1() {
        Korpa k = new Korpa();
        for(int i = 0; i < 50; i++) {
            k.dodajArtikl(new Artikl("A", 1000, "1234"));
        }
        assertFalse(k.dodajArtikl(new Artikl("A", 1000, "1234")));

    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("A", 1000, "1234"));
        k.dodajArtikl(new Artikl("A", 1000, "1235"));
        k.dodajArtikl(new Artikl("A", 1000, "1235"));

        Artikl a = k.izbaciArtiklSaKodom("1237");

        assertEquals(3, k.getBroj_artikala());
        assertEquals(null, a);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("A", 1000, "1234"));
        k.dodajArtikl(new Artikl("A", 1000, "1235"));
        k.dodajArtikl(new Artikl("A", 1000, "1235"));

        assertEquals(3000, k.dajUkupnuCijenuArtikala());
    }
}