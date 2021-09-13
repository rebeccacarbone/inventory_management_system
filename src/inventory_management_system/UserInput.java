package inventory_management_system;

import java.util.Scanner; 
import java.util.InputMismatchException;

public class UserInput {

    public int getInt() { 
        
        Scanner userInput = new Scanner(System.in);
        int value;
        
        try {
            value = userInput.nextInt();
            return value; 
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
        
        System.out.println("Please enter a whole integer value: ");
        int validNumber = getInt();
        return validNumber;
    }
    
	public String getChoice(String choice1, String choice2) {
		Scanner userInput = new Scanner(System.in);
        String value;
        
        try {
            value = userInput.nextLine();
            if(isValidChoice(value, choice1, choice2))
					return value;
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
        
        System.out.println("Please enter 'yes' or 'no': ");
        String validInput = getChoice(choice1, choice2);
        return validInput;
	}
	
	public boolean isValidChoice(String input, String choice1, String choice2) {
			return input.equalsIgnoreCase(choice1) || input.equalsIgnoreCase(choice2);
	}
	
	public String getString() {
			Scanner userInput = new Scanner(System.in);
			String input;
			
			try {
				input = userInput.nextLine();
				return input;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a flavor name:");
				String validInput = getString();
				return validInput;
			}
	}
	public String getFlavorList() {
			
			Scanner userInput = new Scanner(System.in);
			String list;
			
			try {
				list = userInput.nextLine();
				return list;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input.");
			}
			
			System.out.println("Enter desired flavor names separated by commas. Press ENTER when done: ");
			String validList = getFlavorList();
			return validList;
	}
	
	public String getMenuChoice() {
		Scanner userInput = new Scanner(System.in);
        String value;
        
        try {
            value = userInput.nextLine();
            if(isValidMenuChoice(value))
					return value;
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
        
        System.out.println("Please enter a valid menu option: ");
        String validInput = getMenuChoice();
        return validInput.toLowerCase();
	}
	
	public boolean isValidMenuChoice(String input) {
			return input.equalsIgnoreCase("view") || input.equalsIgnoreCase("create") || input.equalsIgnoreCase("update") || input.equalsIgnoreCase("calculate") || input.equalsIgnoreCase("options");
	}
	
}
