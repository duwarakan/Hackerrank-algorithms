import java.util.Scanner;

public class Rocket {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
       
		int n = in.nextInt();
		double positive = 0;
		double negative =0;
		double zero = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
     if (arr[arr_i] >0) {
		positive ++;
	} else if (arr[arr_i] == 0){
        zero ++;
        
	}   else {
        negative ++;
        }
        
        
        
        }
    
	System.out.println(positive/n );
	System.out.println(negative/n);
	System.out.println(zero/n );
	
	
	}
}
