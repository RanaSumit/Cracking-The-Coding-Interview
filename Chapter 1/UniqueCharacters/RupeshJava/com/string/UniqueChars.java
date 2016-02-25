/** Cracking the coding String Questions
 *	Check whether a string has all unique characters or not.
 * 	@author Rupesh Dabbir
 */
package com.string;

import java.util.Scanner;

public class UniqueChars {
	
	public static String isUniqueChars(String str) {
	    if (str.length() > 26) { //Alphabet = 26 chars?
	        return "String does not have Unique Characters"; //No go!
	    }
	    int checker = 0;
	    for (int i = 0; i < str.length(); i++) { 
	    	
	        // Val is the difference that set between i and 'a'
	        // Lets say you have an upper case letter like "B", you will get a negative 'val' which is  illegal
	    	
	        int val = str.charAt(i) - 'a';
	        // We already know that if a letter is repeated (already seen) before, it's respective bit in checker should have been set.
	        // Quitting
	        
	        if ((checker & (1 << val)) > 0) return "String does not have Unique Characters";
	        checker |= (1 << val);         // set the bit to indicate we have now seen the letter.
	    }
	    return "String Has Unique Characters"; //Hooray!! Unique Characters
	}

	public static void main(String[] args) {
		
		Scanner scanthis = new Scanner(System.in);
		String UserInput = scanthis.nextLine();
		
		//Edge Case: Check if user input != null proceed only if it's !null
		if(UserInput != null){
			//System.out.println("Entererd Input is:" +UserInput);
			System.out.println(isUniqueChars(UserInput));
		}
		
	}

}
