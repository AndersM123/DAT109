package spillfiler;

import java.util.ArrayList;

/**
 * Definerer et stigespillbrett
 *
 * @author AM
 */
public class Brett {

    private static final int SIZE = 100;
    ArrayList<Rute> brett;
    ArrayList<Rute> ruter = new ArrayList<>();

    /**
     * Lager stigespill brettet
     */
    public void brett() {
        this.brett = genererRuter();

    }

    private ArrayList<Rute> genererRuter() {
        for(int i=1; i <= SIZE; i++) {
            Rute r = new Rute(i, 0);
            ruter.add(r);
        }
        return genererRuter();
    }

    public Rute flytt(Rute rute, Integer verdi) {
        int indeks = ruter.indexOf(rute);
        int nyIndeks = (indeks+verdi) % SIZE;
        return ruter.get(nyIndeks);

    }




}
