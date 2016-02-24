/** Cracking the coding String Questions
 *	Check whether a string has all unique characters or not.
 * 	@author Rupesh Dabbir
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueChars2 {
	
	public static String checkUnique(String userInput) {
		
		boolean isUnique = false;
		if (userInput.length() > 256) 
			return "Not Unique"; //Since a char value can hold one of only 256 different values, any string that's longer than 256 characters must contain at least one duplicate.
		ArrayList array = new ArrayList();
		for(int i = 0; i<userInput.length(); i++){
			//char character = userInput.charAt(i); //Convert into characters and store it
			int j = userInput.indexOf(userInput.charAt(i)); //Take character
			array.add(j);
		}
		Collections.sort(array);
		for(int i=0; i<(array.size()-1); i++){
			if(array.get(i)== array.get(i+1)) return "Not unique";
		}
		
		return "Has Unique Character";
	}
	
	public static void main (String args[]){
		
		Scanner scanInput = new Scanner(System.in);
		String userInput = scanInput.nextLine();
		//System.out.println("Input: "+ userInput);
		if(userInput != null && userInput != "" ){ //Edge Case: Check the user input for Null and blank inputs if yes, deny!
			System.out.println(checkUnique(userInput));
		}
		else{
			System.out.println("Empty String. Quitting");
		}
	}

}
