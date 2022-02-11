package spillfiler;

import java.util.ArrayList;
import java.util.List;

public class Stigespill {

    private List<Spiller> spillere = new ArrayList<>();
    private Brett brett;
    private Terning terning;
    private Spiller spiller;
    private Brikke brikke;

    static int[] SlangeOgStige = {2, 4, 8, 15, 28, 36, 47, 48, 51, 53, 62, 64, 71, 80, 86, 92, 95, 98 };
    static int[] SlangeOgStigeSum = {36, 10, 23, -10, 56, 8, -21, -37, 16, 3, -44, -4, 20,-62,-19, -20, -20};

    /**
     * returnerer et positivt eller negativt tall basert på hvilken rute den havner på
     * det avgjøres ved summen av angitt rute og antall steg ned eller opp avhengig om det er en slange
     * eller en stige
     * @param rute
     * @return
     */
    public static int sumRute(int rute) {
        for (int i=0; i < SlangeOgStige.length; i++) {
            if(SlangeOgStige[i] == rute) {
                return SlangeOgStigeSum[i];
            }
        }
        return rute;
    }

    public void spill() {

         while(!spiller.FerdigSpill(brikke)) {
             spillRunde();
      }
    }

    private void spillRunde() {
        for(Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }
    }


}