package terningspill;

import java.util.ArrayList;
import java.util.List;

public class Kopp {

	private int id;
	private int sum;
	Terning terning;
	List<Terning> terninger = new ArrayList<>(1);
	
	public Kopp(int id, int sum) {
		this.id=id;
		this.sum=terning.getVerdi();
	}
	
	public int trill() {
		for(int i = 0; i < 1; i++) {
			sum = (int) (Math.random()*6)+1;
		}
		return sum;		
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
	
}
