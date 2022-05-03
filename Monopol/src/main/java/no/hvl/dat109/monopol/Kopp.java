package no.hvl.dat109.monopol;

import java.util.ArrayList;

/**
 * Definerer en kopp med terninger.
 * 
 * @author Atle Geitung
 */
public class Kopp {
	private ArrayList<Terning> terninger = new ArrayList<>(2);

	public void trill() {
		for (Terning terning: terninger) {
			terning.trill();
		}
	}
	
	public Integer getSum() {
		Integer sum = 0;
		for (Terning terning: terninger) {
			sum += terning.getVerdi();
		}
		return sum;
	}
}
