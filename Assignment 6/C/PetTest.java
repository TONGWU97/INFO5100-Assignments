package homework06;

public class PetTest {
	public static void main(String[] args) {
		Pet spot = new Pet("spot", "Mary", "Black and White");
		spot.setSex(0);
		System.out.println(spot.toString());

		System.out.println();

		Cat Tom = new Cat("Tom", "Bob", "black", "short");
		Tom.setSex(2);
		System.out.println(Tom.toString());

		System.out.println();

		Dog Spot = new Dog("Spot", "Susan", "white", "medium");
		Spot.setSex(2);
		System.out.println(Spot.toString());
	}
}
