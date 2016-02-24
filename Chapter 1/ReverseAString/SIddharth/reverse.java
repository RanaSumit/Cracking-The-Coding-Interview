//Find the reverse of the given string.
import java.util.*;
import java.lang.*;

public class reverse{

	public static void main(String []args){

		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] carray = s.toCharArray();
		work w = new work();
		String re = w.rev(carray);
		System.out.println(re);
		
	}
}

class work{


	public String rev(char[] c){
	int a = c.length;
	char[] narray = new char[a];
	
	int n = a-1;
	for(int i = 0; i <= n; i++)
	{
		narray[i] = c[n-i];
	}
	 String ans = new String(narray);
	 return ans;
  }
}