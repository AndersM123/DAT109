package terningspill;

public class Main {

	static Spiller spiller;
	static Kopp kopp;
	
	public static void main(String[] args) {
		Terningspill spill = new Terningspill();
		System.out.println("Spillere:" + spiller.getNavn() + "Verdi: " + kopp.getSum());
	}

}
