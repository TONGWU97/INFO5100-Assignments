package homework05;

public class IceCream extends DessertItem{
	private double cost;
	
	public IceCream(String name, double cost){
		this.name = name;
		this.cost = cost;
	}
	
	public int getCost(){
		return (int) Math.round(this.cost);
	}
}
