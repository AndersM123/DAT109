package terningspill;

import java.util.ArrayList;
import java.util.List;

public class Terningspill {

	private int id;
	private Spiller spiller;
	private Kopp kopp;
	private List<Spiller> spillere = new ArrayList<>();
	
	public void leggTilSpiller(Spiller navn) {
		spillere.add(navn);
	}
	
	public void lagSpill() {
		for(Spiller s : spillere) {
			s.Spill(kopp);
		}
	}
	
	
}
