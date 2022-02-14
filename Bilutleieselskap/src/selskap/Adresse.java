package selskap;

public class Adresse {

	private String Gatenavn;
	private int postNr;
	private String postSted;
	
	public Adresse(String gatenavn, int postNr, String postSted) {
		this.Gatenavn = gatenavn;
		this.postNr = postNr;
		this.postSted = postSted;
	}
	
	@Override
	public String toString() {
		return "Adresse [Gatenavn=" + Gatenavn + ", postNr=" + postNr + ", postSted=" + postSted + "]";
	}



	public String getPoststed() {
		return Gatenavn;
	}

	public void setGatenavn(String gatenavn) {
		Gatenavn = gatenavn;
	}

	public int getPostNr() {
		return postNr;
	}

	public void setPostNr(int postNr) {
		this.postNr = postNr;
	}

	public String getPostSted() {
		return postSted;
	}

	public void setPostSted(String postSted) {
		this.postSted = postSted;
	}

	

	
	
	
	
}
