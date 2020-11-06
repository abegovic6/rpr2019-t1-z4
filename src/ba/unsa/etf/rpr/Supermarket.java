package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int broj_artikala;

    public int getBroj_artikala() {
        return broj_artikala;
    }

    public  void dodajArtikl (Artikl artikl) {
        artikli[broj_artikala] = artikl;
        broj_artikala++;
    }
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



}
