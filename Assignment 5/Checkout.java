package homework05;

import java.util.Vector;

public class Checkout {
	public Vector<DessertItem> items;

	public Checkout() {
		this.items = new Vector<DessertItem>();
	}

	public int numberOfItems() {
		return this.items.size();
	}

	public void enterItem(DessertItem item) {
		this.items.add(item);
	}

	public void clear() {
		this.items.clear();
	}

	public int totalCost() {
		int total = 0;
		for (DessertItem item : this.items) {
			total += item.getCost();
		}
		return total;
	}

	public int totalTax() {
		return (int) Math.round(totalCost() * DessertShoppe.taxRate);
	}

	public String toString() {
		String str = "             " + DessertShoppe.storeName + "\n     ----------------------\n";
		for (DessertItem item : items) {
	
			if (item instanceof Sundae) {
				str += "\n" + String.format("%-22s", item.getName().split("\\n")[0]) + "\n"
						+ String.format("%-22s", item.getName().split("\\n")[1])
						+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(item.getCost()));
			}
	
			else if (item instanceof IceCream) {
				str += "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(item.getCost()));
			}
			
			else if (item instanceof Cookie) {
				str += "\n"
						+ String.format("%-22s", ((Cookie) item).getNumber() + " @ "
								+ DessertShoppe.cents2DollarsAndCents(((Cookie) item).getPricePerDozen()) + " /dz.")
						+ "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(item.getCost()));
			}

			else {
				str += "\n"
						+ String.format("%-22s", ((Candy) item).getWeight() + " lbs. @ "
								+ DessertShoppe.cents2DollarsAndCents(((Candy) item).getPricePerPound()) + " /lb.\n")
						+ String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(item.getCost()));
			}
		}
		str += "\n\n" + String.format("%-22s", "Tax")
				+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(totalTax())) + "\n"
				+ String.format("%-22s", "Total Cost")
				+ String.format("%10s", DessertShoppe.cents2DollarsAndCents(totalCost() + totalTax())) + "\n\n";
		return str;
	}
}
