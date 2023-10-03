package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {	
		double feeding = (beer * 5) + (softDrink * 3) + (barbecue * 7);
		return feeding;
	}
	
	public double cover() {
		double cover;
		if (feeding() > 30.0) {
			cover = 0;
		}
		else {
			 cover = 4.0;
		}
		return cover;
	}
	
	public double ticket() {
		double ticket;
		if (gender=='F' || gender=='f'){
			ticket = 8;
		}
		else {
			ticket = 10;
		}
		return ticket;
	}
	
	
	
	public double total(double cover, double feeding, double ticket) {
		double total = cover + feeding + ticket;
		return total;
	}
}
