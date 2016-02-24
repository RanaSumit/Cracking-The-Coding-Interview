//Find if the given string has all unique charaters

import java.util.*;
import java.lang.*;

public class unique{
	
	public static void main(String []args){

	Scanner in = new Scanner(System.in);
	String str = in.next();

	char[] carray = str.toCharArray();
	check c = new check();
	String ans = c.uCheck(carray);
	System.out.println(ans);

	}
}

class check{

    boolean[] std = new boolean[256];
	
	public String uCheck(char[] c){

		for(int i = 0; i < c.length ; i++){

			int a= (int) c[i];

			if(std[a] == true)
			{
				return "Not Unique";
			}
			else
			{
				std[a] = true;
			}
		}
		return "Unique";


	}
}
