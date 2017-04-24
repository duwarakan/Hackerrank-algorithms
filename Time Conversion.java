

import java.util.Scanner;

public class timeconvertion {
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
    String time = in.next();	
   in.close();
   int x = Integer.parseInt(time.substring(0,2));
   
    
   if (time.substring(8, 10).equals("PM") && !time.substring(0, 2).equals("12") ) {
	 x += 12;
	 System.out.println(x  +":" + time.substring(3,8));
	}
   else if (time.substring(8, 10).equals("PM") && time.substring(0,2).equals("12") ) {
		
		 System.out.println(x  +":" + time.substring(3,8));
		}
   else if (time.substring(8, 10).equals("AM") && time.substring(0, 2).equals("12") ){
	   System.out.println( "00" + ":" + time.substring(3,8));
	   
	   //System.out.println(time.substring(0,8));
	
}
   else {
	   System.out.println(time.substring(0,8));
   }
   // System.out.println(time.substring(8,10));
	}
}
