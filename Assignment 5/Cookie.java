package homework05;

public class Cookie extends DessertItem{
	private int number;
	private double pricePerDozen;
	
	public Cookie(String name, int number, double pricePerDozen){
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getCost(){
		return (int) Math.round((this.pricePerDozen/12)*this.number);
	}
	
	public int getNumber() {
		return number;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}
}
