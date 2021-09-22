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
    
	
	
}
