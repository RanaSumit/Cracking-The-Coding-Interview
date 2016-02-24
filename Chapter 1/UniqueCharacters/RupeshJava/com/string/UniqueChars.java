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
	    	
	        // set val to be the difference between the char at i and 'a'
	        // if you have an upper-case letter e.g. 'A' you will get a
	        // negative 'val' which is illegal
	    	
	        int val = str.charAt(i) - 'a';
	        // if this lowercase letter has been seen before, then
	        // the corresponding bit in checker will have been set and
	        // we can exit immediately.
	        
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
