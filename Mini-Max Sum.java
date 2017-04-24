import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;


public class maxmin {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 ArrayList<Long> arraylist = new ArrayList<Long>();
		 
		   arraylist.add( in.nextLong());
		   arraylist.add( in.nextLong());
		   arraylist.add( in.nextLong());
		   arraylist.add( in.nextLong());
		   arraylist.add( in.nextLong());
	       
		   Collections.sort(arraylist);
		   //System.out.println(arraylist);
	      
		   int z;
		   long min = 0;
		   for(z = 0; z < arraylist.size()-1; z++)
		       min += arraylist.get(z);
		   
		   
		   
		   
		   
		   
		   
		   int i =1;
		   long sum = 0;
		   for(i = 1; i < arraylist.size(); i++)
		       sum += arraylist.get(i);
		   System.out.println(min  + "\t" + sum );
		   
		   
	        
	      // long f[] = new long[]{a, b, c, d, e};
	       
	      // Collections.sort();
	      
	       
	       
	       
	       //System.out.println(Arrays.toString(f));
	    
	
	//long E1 = Math.min(a, b);
	//long E2 = Math.min(c, d);
	//long E3 = Math.min(e, E1);
	//long E4 = Math.min(E3, e);
	//System.out.println(E4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
