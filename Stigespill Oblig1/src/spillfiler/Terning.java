package spillfiler;

public class Terning {

	private final int MAX = 6;
	private int faceValue;
	
	/**
	 * Setter et utgangspunkt for terningen
	 */
	public Terning() {
		
		faceValue = 1;
	}
	
	/**
	 * Gir en verdi på terning gitt int value
	 * @param value
	 */
	public Terning(int value) {
		faceValue = value;
	}

	/**
	 * Henter verdien til faceValue
	 * @return
	 */
	public int getFaceValue() {
		return faceValue;
	}

	public int trill() {
		faceValue = (int)((Math.random()*MAX)+1);
		return faceValue;
	}

	/**
	 * Returnerer det terningen viser
	 * @return
	 */
	public String toString() {
		String resultat = Integer.toString(faceValue);
		return resultat;
		// return Integer.toString(faceValue);
	}




	
	
}
