import java.util.Scanner;

public class Production {
	ArrayList<Flavor> currentInventory;
	ArrayList<Flavor> productionList;
	Formula formula;
	
	pubic Production(ArrayList<Flavor> inventoryList, String type) {
		currentInventory = inventoryList;
		if(type.equalsIgnoreCase("dough") 
			formula = new DoughFormula();
		else
			formula = new CookFormula();
	}
	
	public void flavorsToProduce() {
		UserInput ui = new UserInput();
		System.out.println("To create a production list for all flavors enter ALL, otherwise enter SPECIFIC");
		String allOrSpec = ui.getChoice("all", "specific");
		if(allOrSpec.equalsIgnoreCase("all") 
			productionList = currentInventory;
		else {
			System.out.println("Enter desired flavor names separated by commas. Press ENTER when done: ");
			String flavorList = ui.getFlavorList();
			separateFlavors(flavorList);
			
		}
	}
	
	public void separateFlavors(String flavorList) {
		int index = 0;
		String currFlavor;
		while(index < flavorList.length() && flavorList.indexOf(",") != -1) {
			currFlavor = flavorList.substring(index, flavorList.indexOf(","));
			index = flavorList.indexOf(",");
			flavorList = flavorList.substring(index);
			productionList.add(new Flavor(currFlavor));
		}
	}
	
	public void calculateAmount() {
		UserInput ui = new UserInpu();
		System.out.println("To calculate all the same amount enter SAME, otherwise enter DIFFERENT");
		String sameOrDiff = ui.getChoice("same", "different");
		if(sameOrDiff.equalsIgnoreCase("same")) 
			productionList = formula.allSameCalc(productionList);
		else if(sameOrDiff.equalsIgnoreCase("different") 
			productionList = formula.differentCalc(productionList);
	}
	
	public void writeProdToFile() {
		//TBA
	}
	
}