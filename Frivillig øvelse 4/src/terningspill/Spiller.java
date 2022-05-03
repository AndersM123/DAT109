package terningspill;

public class Spiller {

	private String navn;
	private int verdi;
	
	public Spiller(String navn, int verdi) {
		this.verdi=verdi;
		this.navn=navn;
	}
	
	public void Spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
	}
	
	public String getNavn() {
		return navn;
	}
}
