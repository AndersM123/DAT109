package no.hvl.dat109.monopol;

import java.util.ArrayList;

/**
 * Klasse som simulerer et monopolspill.
 * 
 * @author Atle Geitung
 */
public class Monopolspill {
	private Kopp kopp = new Kopp();
	private ArrayList<Spiller> spillere = new ArrayList<>();
	private Brett brett = new Brett();
	
	/**
	 * Starter monopolspillet.
	 */
	public void spill() {
		for (int i = 0; i < 20; i++) {
			spillRunde();
		}
	}

	/**
	 * Spiller en runde monopol.
	 */
	private void spillRunde() {
		for (Spiller spiller: spillere ) {
			spiller.spillTrekk(kopp);
		}
	}
	
}
