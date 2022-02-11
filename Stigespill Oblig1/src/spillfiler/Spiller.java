package spillfiler;

public class Spiller {

    private String navn;
    private Terning terning;
    private Brikke brikke = new Brikke();
    private Brett brett;

    public Spiller(String navn) {
        this.navn = navn;
    }

    public void spillTrekk(Terning terning) {
        terning.trill();
        Integer verdi = terning.getFaceValue();
        Rute rute = brikke.getRute();
        rute = brett.flytt(rute, verdi);
        brikke.setRute(rute);
    }

    public boolean FerdigSpill(Brikke brikke) {
        boolean ferdig = false;
        Rute indeks = brikke.getRute();

        if(indeks.getPosisjon()==100) {
            System.out.println("Spillet er ferdig");
            ferdig = true;
        }
        return ferdig;
    }
}



