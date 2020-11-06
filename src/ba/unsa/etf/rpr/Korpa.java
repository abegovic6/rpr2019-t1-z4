package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int broj_artikala;

    public  boolean dodajArtikl (Artikl artikl) {
        if(broj_artikala == 49) return false;
        artikli[broj_artikala] = artikl;
        broj_artikala++;
        return true;
    }

    public int getBroj_artikala() { return broj_artikala; };
    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < broj_artikala; i++) {
            if(kod.equals(artikli[i].getKod())) {
                a = artikli[i];
                artikli[i] = null;
                break;
            }
        }
        return a;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena = 0;
        for(int i = 0; i < broj_artikala; i++) {
            if(artikli[i] != null)
                ukupna_cijena = ukupna_cijena + artikli[i].getCijena();
        }

        return  ukupna_cijena;
    }

}
