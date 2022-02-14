package selskap;

import java.util.List;

public class Utleiekontor {

	private int kontorNr;
	private int telefonNr;
	private Adresse adresse;
	
	public Utleiekontor(int kontorNr, int telefonNr, Adresse adresse) {
		
		this.kontorNr = kontorNr;
		this.telefonNr = telefonNr;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Utleiekontor [kontorNr=" + kontorNr + ", telefonNr=" + telefonNr + ", adresse=" + adresse + "]";
	}


	public int getKontorNr() {
		return kontorNr;
	}

	public void setKontorNr(int kontorNr) {
		this.kontorNr = kontorNr;
	}

	public int getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(int telefonNr) {
		this.telefonNr = telefonNr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}
