//Procedure for read inventory
//	if inventory.txt exists && !empty
//		readInventory()
//	if !exists || (exists && empty)
//		throw noinventory error
		
//Procedure for readInventory()
//	read file into new Inventory object
//	displayInventory()
	
//Procedure for updateInventory
//	if inventory exists && !empty
//		displayInventory
//		sout("enter flavors to update")
//		flavorUpdate()
//	else
//		sout("no inventory currently on file. enter new one?")
//		if yes
//		create new inventory object from input
//		if no
//		exit

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
		
public class Main {

	public static void main(String[] args) {
			
	}
	
	public static void menu() {
		UserInput ui = new UserInput();
		
		while(true) {
			System.out.println("What would you like to do? /nOptions: /nView Inventory (Enter 'view') /nCreate Inventory /nUpdate Inventory (Enter 'update') /nCalculate a production quantity (Enter 'calculate') /nExit");
			String choice = ui.getMenuChoice();
			switch(choice) {
				case "view":
					break;
				case "create":
					break;
				case "update":
					break;
				case "calculate":
					break;
				case "exit":
					exit();
			}
			
			
		}
	}
	
	public static Inventory readInventoryFromFile() {
		try {
			File inventoryFile = new File("inventory.txt");
			if (inventoryFile.isFile()) {
				Inventory newInventory = new Inventory(inventoryFile);
				return newInventory;
			}
			else {
				throw new FileNotFoundException();
			}
		}
		catch (IOException e) {
			System.out.printf("ERROR: %s\n", e);
			return null;
		}
	}
	
	public static void exit() {
		//TBA
	}
	
	
}