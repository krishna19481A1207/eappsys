package eappsys;

import java.util.*;


public class dec_to_oct {
    
    public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in); 
    	System.out.println("enter Any number");
    		     int n = s.nextInt();
    
    
            StringBuilder c = new StringBuilder();
            
   
    while(n != 0)
    {
        int r = n%8;
        n = n/8;
        c.append(r);
     
    }
    System.out.print(c.reverse().toString());
    
    }
}
