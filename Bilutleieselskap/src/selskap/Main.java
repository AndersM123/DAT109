package selskap;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Utleiekontor> kontorer = new ArrayList<Utleiekontor>();
		Utleiekontor Bergen = new Utleiekontor(1, 12345678, new Adresse("skliveien", 5054, "Bergen"));
		Utleiekontor Oslo = new Utleiekontor(2, 12345679, new Adresse("gåveien", 1234, "Oslo"));
		kontorer.add(Bergen);
		kontorer.add(Oslo);
		
		
		List<Bil> biler = new ArrayList<Bil>();
		biler.add(new Bil("Volkswagen","Golf" ,"Rosa","HS123453" ,"A", false, 500000, Bergen));
		biler.add(new Bil("BMW","x1", "svart", "VS51283", "B", true, 150000, Bergen));
		biler.add(new Bil("Tesla","X" ,"Rød","HS123458" ,"C", true, 120000, Oslo));
		biler.add(new Bil("Audi","A6" ,"Hvit","HS123456" ,"D", true, 100000, Bergen));
		
		
		List<Kunde> kunder = new ArrayList<Kunde>();

		
		Kunde.registrer(kunder);

		for (Kunde k : kunder) {
			if (k.erReg(k.getTelefonNr())) {
				
				BilUtleie.bilerVedSted(biler);
				BilUtleie.reserver(biler, kontorer);
			}
		}
	}
}
