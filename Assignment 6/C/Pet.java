package homework06;

public class Pet {
	private String name;
	private String ownerName;
	private String color;
	public static final int MALE = 0, FEMALE = 1, SPAYED = 2, NEUTERED = 3;

	protected enum Sex {
		MALE, FEMALE, SPAYED, NEUTERED;
	}

	protected int sex;

	Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return this.name;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public String getColor() {
		return this.color;
	}

	public void setSex(int sexid) {
		if (sexid >= 0 && sexid <= 3) {
			this.sex = sexid;
		} else
			return;
	}

	public String getSex() {
		if (this.sex == MALE) {
			return "MALE";
		} else if (this.sex == FEMALE) {
			return "FEMALE";
		} else if (this.sex == SPAYED) {
			return "SPAYED";
		} else {
			return "NEUTERED";
		}
	}
	
	public String toString(){
        return "Spot owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\n"+this.getSex();
    }
}
