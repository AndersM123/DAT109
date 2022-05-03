package no.hvl.dat109.monopol;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer et monopolbrett.
 * 
 * @author Atle Geitung
 */
public class Brett {
	private final static Integer ANTALL_RUTER = 40;
	private List<Rute> ruter = new ArrayList<>(ANTALL_RUTER);

	/**
	 * Lager et monopolbrett. 
	 */
	public Brett() {
		Rute rute = null; 
		for (Integer pos = 0; pos < ANTALL_RUTER; pos++) {
			rute = new Rute();
		}
		ruter.add(rute);
	}

	public Rute flytt(Rute rute, Integer sum) {
		// kan være hensiktsmessig at rutene har et nummer.
		int indeks = ruter.indexOf(rute);
		int nyIndeks = (indeks + sum) % ANTALL_RUTER;
		return ruter.get(nyIndeks);
	}
}
