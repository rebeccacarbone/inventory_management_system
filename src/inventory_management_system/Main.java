package inventory_management_system;

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

public static Inventory readInventoryFromDB() {
	return new Inventory();
	
}

public static void exit() {
	//TBA
}
}


