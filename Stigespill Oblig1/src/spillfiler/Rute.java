package spillfiler;

public class Rute {

    private int posisjon;
    private int destinasjon;

    public Rute(int posisjon, int dest) {
    this.posisjon = posisjon;
    this.destinasjon = dest;
    }

    public int getDestinasjon() {

        return destinasjon;
    }

    public void setDestinasjon(int destinasjon) {

        this.destinasjon = destinasjon;
    }

    public int getPosisjon() {

        return posisjon;
    }

    public void setPosisjon(int posisjon) {

        this.posisjon = posisjon;
    }

}
