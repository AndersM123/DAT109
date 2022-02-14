package selskap;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class BilUtleie {

	Utleiekontor Utleiested;
	LocalDateTime dato;
	int antallDager;

	public static void bilerVedSted(List<Bil> bil) {

		Scanner objekt = new Scanner(System.in);
		System.out.println("Hvilken type bil (A, B, C, D): ");
		String biltype = objekt.nextLine();
		System.out.println("Type: " + biltype);

		System.out.println("Hvor vil du hente bilen: ");
		String lokasjon = objekt.nextLine();
		System.out.println("Sted: " + lokasjon);

		switch (biltype) {
		case "A":
			System.out.println("liten bil");
			for (int i = 0; i < bil.size(); i++) {
				if (bil.get(i).getUtleiegruppe() == "A") {
					System.out.println(bil.get(i).toString());
				}
			}
			break;
		case "B":
			System.out.println("mellomstor bil");
			for (int i = 0; i < bil.size(); i++) {
				if (bil.get(i).getUtleiegruppe() == "B") {
					System.out.println(bil.get(i).toString());
				}
			}
			break;
		case "C":
			System.out.println("Stor bil");
			for (int i = 0; i < bil.size(); i++) {
				if (bil.get(i).getUtleiegruppe() == "C") {
					System.out.println(bil.get(i).toString());
				}
			}
			break;
		case "D":
			System.out.println("Stasjonsvogn");
			for (int i = 0; i < bil.size(); i++) {
				if (bil.get(i).getUtleiegruppe() == "D") {
					System.out.println(bil.get(i).toString());
				}
			}
			break;

		default:
			System.out.println("Ingen ledige biler på valgt sted");
		}

	}

	public static int prisklasse(Bil bil) {
		int dagsPris = 0;

		if (bil.getUtleiegruppe() == "A") {
			dagsPris = 1000;
		}

		else if (bil.getUtleiegruppe() == "B") {
			dagsPris = 1500;
		}

		else if (bil.getUtleiegruppe() == "C") {
			dagsPris = 2000;
		}

		else if (bil.getUtleiegruppe() == "D") {
			dagsPris = 2500;
		}

		return dagsPris;
	}
	
	public static boolean finnesPåSted(List<Bil> b, List<Utleiekontor> sted) {
		boolean finnes = false;
		
		for(int i=0; i < b.size(); i++) {
			
		if(b.get(i).getSted() == sted.get(i)) {
			finnes = true;
			}
		}
		return finnes;
	}

	public static void reserver(List<Bil> biler, List<Utleiekontor> sted) {

		Scanner objekt = new Scanner(System.in);
		System.out.println("Skriv inn regNr på valgt bil: ");
		String regnr = objekt.nextLine();
		System.out.println("Bil: " + regnr);
		
		System.out.println("Hvor lenge vil du leie bilen: ");
		int antDager = objekt.nextInt();
		System.out.println("antall dager: " + antDager);
		
		String outprint = "";
		int pris = 0;
		for (Bil b : biler) {

			//&& finnesPåSted(biler, sted)
			if (b.getRegistreringsNr().equals(regnr)) {
				outprint = ("Valgt bil: " + b.getMerke() + " " + b.getModell());
				
				if (b.erTilgjengelig()) {
					b.setTilgjengelig(false);
					
					pris = (prisklasse(b)*antDager);
					
				} else {
					outprint = ("Bilen er ikke tilgjengelig");
				} 	
			}	
		}
		System.out.println(outprint);
		System.out.println(pris);
		
		objekt.close();
	}

}
