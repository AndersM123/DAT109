package no.hvl.dat109.monopol;

/**
 * Definerer en spiller i monopolet.
 * 
 * @author Atle Geitung
 */
public class Spiller {
	private String navn;
	private Brikke brikke = new Brikke();
	private Brett brett;

	/**
	 * Spille ett trekk med en spiller.
	 */
	public void spillTrekk(Kopp kopp) {
		kopp.trill();
		Integer sum = kopp.getSum();
		Rute rute = brikke.getRute();
		rute = brett.flytt(rute, sum);
		brikke.setRute(rute);
	}
	
	
}
