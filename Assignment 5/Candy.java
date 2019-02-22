package homework05;

public class Candy extends DessertItem{
	private double weight;
	private double pricePerPound;
	
	public Candy(String name, double weight, double pricePerPound){
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	public int getCost(){
		return (int) Math.round(this.pricePerPound*this.weight);
	}
	
	public String getWeight() {
		return String.format("%.2f", weight);
	}

	public double getPricePerPound() {
		return pricePerPound;
	}
}
