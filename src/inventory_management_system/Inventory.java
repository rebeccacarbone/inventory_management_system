package inventory_management_system;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Inventory {
private ArrayList<Flavor> inventoryList;

	public Inventory() {
		fillListFromDatabase();
	}
	
	public void fillListFromInput() {
		UserInput ui = new UserInput();
		String choice = "yes";
		String name;
		int amountOfPacks, amountOfDough;
		System.out.println("Enter the first flavor you would like to add: ");
		while(!choice.equalsIgnoreCase("no")) {
			name = ui.getString();
			System.out.println("Enter amount in packs (0, 20, etc.): ");
			amountOfPacks = ui.getInt();
			System.out.println("Enter amount of dough (batches) (0, 20, etc.): ");
			amountOfDough = ui.getInt();
			inventoryList.add(new Flavor(name, amountOfPacks, amountOfDough));
			System.out.println("Would you like to add another flavor?");
			choice = ui.getChoice("yes", "no");
		}
	}
	
	private void fillListFromDatabase() {
		//in process of setting up AWS environment
	}
	
	public void calculateProdQuantity() {
		UserInput ui = new UserInput();
		System.out.println("Do you want to calculate a DOUGH production or a COOKING production?");
		String type = ui.getChoice("dough", "cooking");
		
		Production prod = new Production(inventoryList, type);
		//prod.getFlavors();
		//prod.calculateAmount();
	}
}
