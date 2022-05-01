package terningspill;

public class Kopp {

	private int id;
	private int sum;
	
	public Kopp(int id, int sum) {
		this.id=id;
		this.sum=sum;
	}
	
	public int trill() {
		sum = (int) (Math.random()*6)+1;
		return sum;
	}
	
}
