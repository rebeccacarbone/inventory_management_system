public class Flavor {
	
	private String flavorName;
	private int amountPacks;
	private double amountDough;
	private int desiredPacks;
	private double desiredDough;
	private double doughToMake;
	private double doughToCut;

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
	
	public void setDesiredDough(double dough) {
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
	
	public double getAmountDough() {	
		return amountDough;
	}
	
	public int getDesiredPacks() {
		return desiredPacks;
	}
	
	public double getDesiredDough() {
		return desiredDough;
	}
	
	public double getDoughToMake() {
		return doughToMake;
	}
	
	public double getDoughToCut() {
		return doughToCut;
	}
	
	
}