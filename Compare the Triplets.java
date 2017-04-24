import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int bob = 0;
        int alice = 0;
        int roller = 0;
        if (a0>b0){
        	alice++;
		}
        else if(a0==b0){
        	roller++;
        }
        else {
        	bob++;
        	
        }
        
        if (a1>b1){
        	alice++;
		}
        else if(a1==b1){
        	roller++;
        }
        else {
        	bob++;
        	
        }
        
        if (a2>b2){
        	alice++;
		}
        else if(a2==b2){
        	roller++;
        }
        else {
        	bob++;
        	
        }
        
        System.out.println(alice+ "\t"+ bob );
    }}