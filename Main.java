//Procedure for read inventory
	if inventory.txt exists && !empty
		readInventory()
	if !exists || (exists && empty)
		throw noinventory error
		
//Procedure for readInventory()
	read file into new Inventory object
	displayInventory()
	
//Procedure for updateInventory
	if inventory exists && !empty
		displayInventory
		sout("enter flavors to update")
		flavorUpdate()
	else
		sout("no inventory currently on file. enter new one?")
		if yes
		create new inventory object from input
		if no
		exit
		
public class Main {

	public static void main(String[] args) {
			
	}
	
	public static void menu() {
		UserInput ui = new UserInput();
		
		while(true) {
			System.out.println("What would you like to do? /nOptions: /nView Inventory (Enter 'view') /nUpdate Inventory (Enter 'update') /nCalculate a production quantity (Enter 'calculate') /nExit");
			String choice = ui.getMenuOption();
			switch(choice) {
				case "view":
					break;
				case "update":
					break;
				case "calculate":
					break;
				case "exit";
					exit();
			}
			
			
		}
	}
	
	public static void exit() {
		//TBA
	}
	
	
}