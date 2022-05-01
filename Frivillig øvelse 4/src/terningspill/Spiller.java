package terningspill;

public class Spiller {

	private String navn;
	private int verdi;
	
	public Spiller(String navn, int verdi) {
		this.verdi=verdi;
		this.navn=navn;
	}
	
	public Spiller(Kopp kopp) {
		kopp.trill();
	}
	
}
