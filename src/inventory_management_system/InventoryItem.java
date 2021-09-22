package inventory_management_system;

public class InventoryItem {
	private String itemType;
	private String flavor;
	private int amount;
	
	//constructor for welsh cakes and scones
	public InventoryItem(String newType, String newFlavor, int newAmount) {
		itemType = newType;
		flavor = newFlavor;
		amount = newAmount;
	}
	
	//constructor for scotch eggs, sausage rolls, anything else w/o a flavor
	public InventoryItem(String newType, int newAmount) {
		itemType = newType;
		amount = newAmount;
	}
	
	public int updateAmount(int newAmount) {
		int temp = amount;
		amount = newAmount;
		//subtract new amount from original amount to determine how many were made
		return amount - temp;
	}
}
