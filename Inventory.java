import java.util.Scanner;

public class Inventory {
private ArrayList<Flavor> inventoryList;


	public void fillListFromInput() {
		UserInput ui = new UserInput();
		String choice = "yes";
		String name;
		int amountOfPacks, amountOfDough;
		System.out.println("Enter the first flavor you would like to add: ");
		while(!choice.equalsIgnoreCase("no")) {
			name = ui.getFlavor();
			System.out.println("Enter amount in packs (0, 20, etc.): ");
			amountOfPacks = ui.getInt();
			System.out.println("Enter amount of dough (batches) (0, 20, etc.): ");
			amountOfDough = ui.getInt();
			inventoryList.add(new Flavor(name, amountOfPacks, amountOfDough);
			System.out.println("Would you like to add another flavor?");
			choice = ui.getChoice("yes", "no");
		}
	}
	
	pubic void fillListFromFile() {
		//TBA
	}
	
	public void calculateProdQuantity() {
		UserInput ui = new UserInput();
		System.out.println("Do you want to calculate a DOUGH production or a COOKING production?");
		String type = ui.getChoic("dough", "cooking");
		
		Production prod = new Production(inventoryList, type);
		prod.getFlavors();
		prod.calculateAmount();
	}
}