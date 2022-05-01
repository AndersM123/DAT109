package terningspill;

import java.util.ArrayList;
import java.util.List;

public class Terningspill {

	private int id;
	List<Spiller> spillere = new ArrayList<>();
	
	public void leggTilSpiller(Spiller navn) {
		spillere.add(navn);
	}
	
	public void spill() {
		
	}
	
	
}
