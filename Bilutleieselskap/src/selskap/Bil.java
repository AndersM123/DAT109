package selskap;

import java.util.ArrayList;
import java.util.List;

public class Bil {

	private String merke;
	private String modell;
	private String farge;
	private String registreringsNr;
	private String utleiegruppe;
	private boolean tilgjengelig;
	private int kilometerStand;
	private Utleiekontor sted;

	public Bil(String merke, String modell, String farge, String registreringsNr, String utleiegruppe,
			boolean tilgjengelig, int kilometerStand, Utleiekontor sted) {
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.registreringsNr = registreringsNr;
		this.utleiegruppe = utleiegruppe;
		this.tilgjengelig = tilgjengelig;
		this.kilometerStand = kilometerStand;
		this.sted = sted;
	}

	@Override
	public String toString() {
		return "Bil \n merke=" + merke + "\n modell=" + modell + "\n farge=" + farge + "\n registreringsNr=" + registreringsNr
				+ "\n utleiegruppe=" + utleiegruppe + "\n KM-Stand=" + kilometerStand + "\n sted="
				+ sted.getAdresse().getPoststed();
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public String getRegistreringsNr() {
		return registreringsNr;
	}

	public void setRegistreringsNr(String registreringsNr) {
		this.registreringsNr = registreringsNr;
	}

	public boolean erTilgjengelig() {
		return tilgjengelig;
	}

	public void setTilgjengelig(boolean tilgjengelig) {
		this.tilgjengelig = tilgjengelig;
	}

	public int getKilometerStand() {
		return kilometerStand;
	}

	public void setKilometerStand(int kilometerStand) {
		this.kilometerStand = kilometerStand;
	}

	public Utleiekontor getSted() {
		return sted;
	}

	public void setSted(Utleiekontor sted) {
		this.sted = sted;
	}

	public String getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(String utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}


}
