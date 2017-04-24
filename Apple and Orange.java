import java.util.Scanner;

public class apple_orange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int appleinroof = 0;
        int orangeinroof = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
        apple[apple_i] = (in.nextInt()+a);
       if (   apple[apple_i] >= s    &&      apple[apple_i] <=t) {
    	   appleinroof++;
    	   }
       else { int j = 10;}
        
        
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = (in.nextInt()+b);
            if (orange[orange_i] <= t    && orange[orange_i]>=s) {
         	   orangeinroof++;
         	   }
            else { int j_i = 10;}
            
        }
   
	
	
	System.out.println(appleinroof );
	System.out.println(orangeinroof);
	
	
		
	
	
	
	
	
	}
}



