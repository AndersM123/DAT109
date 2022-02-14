package selskap;

import java.util.List;
import java.util.Scanner;

public class Kunde {

	String fornavn;
	String etternavn;
	int telefonNr;
	int kredittkortNr;
	String adresse;
	
	
	public Kunde(String fornavn, String etternavn, String adresse, int tlf, int kredittkortNr) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse=adresse;
		this.telefonNr = tlf;
		this.kredittkortNr = kredittkortNr;
	}
	
	public static void registrer(List<Kunde> kunder) {
		
		Scanner objekt = new Scanner(System.in);
		System.out.println("Fyll inn Fornavn");
		String fornavn = objekt.nextLine();
		System.out.println("Fornavn: " + fornavn);
		
		System.out.println("Fyll inn etternavn");
		String Etternavn = objekt.nextLine();
		System.out.println("Etternavn: " + Etternavn);
		
		System.out.println("Fyll inn adresse");
		String adr  = objekt.nextLine();
		System.out.println("adresse: " + adr);
		
		System.out.println("Fyll inn tlfnr");
		int tlf = objekt.nextInt();
		System.out.println("TelefonNr: " + tlf);
		
		System.out.println("Fyll inn kortNr");
		int kortnr = objekt.nextInt();
		System.out.println("Kortnummer: " + kortnr);
		
		Kunde nyKunde = new Kunde(fornavn, Etternavn, adr, tlf, kortnr);
		kunder.add(nyKunde);
		
		
	}
	
	public boolean erReg(int tlf) {
		boolean kunde = false;
		
		if(tlf != telefonNr) {
			kunde = false;
		} else {
			kunde = true;
		}
		return kunde;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public int getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(int telefonNr) {
		this.telefonNr = telefonNr;
	}

	public int getKredittkortNr() {
		return kredittkortNr;
	}

	public void setKredittkortNr(int kredittkortNr) {
		this.kredittkortNr = kredittkortNr;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
