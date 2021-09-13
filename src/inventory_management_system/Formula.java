package inventory_management_system;

import java.util.ArrayList;
public interface Formula {
	
	public ArrayList<Flavor> allSameCalc(ArrayList<Flavor> productionList);
	public ArrayList<Flavor> differentCalc(ArrayList<Flavor> productionList);
	
}
