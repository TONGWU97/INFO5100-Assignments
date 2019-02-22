package homework05;

public class DessertShoppe {
	public static final String storeName = "safeway";
	public static final double taxRate = 0.1;
	public static final int maxSizeOfItemName = 20;
	public static final int maxWidthToDisplay = 20;
	
	public static String cents2DollarsAndCents(double d){
		int dollar = (int) (d/100);
		double cent = d%100/100;
		return String.valueOf(dollar+cent);
	}
}
