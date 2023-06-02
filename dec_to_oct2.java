package eappsys;

import java.util.*;

public class dec_to_oct2 {
	
	
	public static void main(String args[] )
	{
	Scanner s = new Scanner(System.in); 
	
	System.out.println("enter Any number");
	
		     int n = s.nextInt();
int i=1, sum=0 ;

while(n != 0)
{
    int r = n%8;
    n = n/8;
   sum = sum + i*r; 
    i=i*10;
 }

System.out.print(sum);

}
}