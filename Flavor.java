public class Flavor {
	
	private String flavorName;
	private int amountPacks;
	private double amountDough;
	private int desiredPacks;
	private double desiredDough;
	private double doughToMake;
	private int doughToCut;

	public Flavor(String name) {
		flavorName = name;
	}
	
	public Flavor(String name, int currPacks, int currDough) {
		flavorName = name;
		amountPacks = currPacks;
		amountDough = currDough;
	}
	
	public void setAmountPacks(int packs) {	
		amountPacks = packs;
	}
	
	public void setAmountDough(int dough) {	
		amountDough = dough;
	}
	
	public void setDesiredPacks(int packs) {
		desiredPacks = packs;
	}
	
	public void setDesiredDough(int dough) {
		desiredDough = dough;
	}
	
	public void setDoughToMake(double make) {
		doughToMake = make;
	}
	
	public void setDoughToCut(double cut) {
		doughToCut = cut;
	}
	
	public int getAmountPacks() {	
		return amountPacks;
	}
	
	public int getAmountDough() {	
		return amountDough;
	}
	
	public int getDesiredPacks() {
		return desiredPacks;
	}
	
	public int getDesiredDough() {
		return desiredDough;
	}
	
	public int getDoughToMake() {
		return doughToMake;
	}
	
	public int setDoughToCut() {
		return doughToCut;
	}
	
	
}