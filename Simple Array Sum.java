import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();

    long sum = 0 ;
    for (int i = 0; i < n; i++) {
        sum += in.nextInt();
    }

    System.out.println(sum);	
		
    }
}