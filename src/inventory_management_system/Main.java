package inventory_management_system;

public class Main {

public static void main(String[] args) {
		
}

public static void menu() {
	Connection conn = new Connection();
	conn.getConnection();
	Inventory inventory = new Inventory(conn);
	UserInput ui = new UserInput();
	System.out.println("Welcome to Welsh Baker Inventory Management");
	int choice = -1;
	
	while(choice != 0) {
		System.out.println("0)Exit \n1) View current inventory \n2)Update inventory \n3)Edit inventory \n4)Calculate percent duds");
		choice = ui.getInt();
		
		switch(choice) {
		case 1: inventory.viewInventory();
		break;
		case 2: inventory.updateInventory();
		break;
		case 3: inventory.editInventory();
		break;
		
		}
	}
	
}


public static void exit() {
	//TBA
}
}


