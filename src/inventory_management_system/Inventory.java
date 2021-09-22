package inventory_management_system;
/** TO DO:
 *	ArrayList of InventoryItems
 * 	Update DB
 *  Add new Item
 *  Calculate production consistency
 */
import java.util.ArrayList;
import java.io.File;

public class Inventory {
	private ArrayList<InventoryItem> inventory = new ArrayList<>();
	
	public Inventory() {
		
	}
	public Inventory(Connection con) {
		fillInventory(con);
	}
	
	private void fillInventory(Connection con) {
		//TODO once DB is set up
	}
	
	public void updateInventory() {
		UserInput ui = new UserInput();
		int cut = 0;
		int stock = 0;
		for(InventoryItem item: inventory) {
			System.out.println("Enter amount cut for " + item.getFlavor());
			cut = ui.getInt();
			System.out.println("Enter current stock for " + item.getFlavor());
			stock = ui.getInt();
			item.updateStock(cut, stock);
		}
		//TODO: implement updateDB
	}
	
	public void editInventory() {
		//ask if user wants to add or delete flavor(s)
		//add - go to addFlavor()
		//delete - go to deleteFlavor()
		
		System.out.println("Enter 'add' to add new flavor(s) or 'delete' to delete flavor(s)");
		//TODO: implement getAddOrDelete in UserInput
		
	}
	
	private void addFlavor() {
		//enter flavor name & current stock
		//append to inventory
		//ask if they want to add another & repeat
		//update in DB
	}
	
	private void deleteFlavor() {
		//enter flavor name to delete
		//search arraylist for name
		//if it exists - remove
		//if not - error
		//ask if they would like to remove anything else & repeat
		//update in DB
	}
	
	public void viewInventory() {
		if(!inventory.isEmpty()) {
			toString();
		}
	}
	
	
}
