package homework05;

public class Sundae extends IceCream{
	public Sundae(String toppingName, double toppingPrice, String name, double price) {
		super(name + "Sundae with\n" + toppingName, toppingPrice + price);
	}
	
	public int getCost(){
		return Math.round(super.getCost());
	}
	
}
