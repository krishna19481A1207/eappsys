package eappsys;

public class dec_to_oct {
    
    public static void main(String args[])
    {
    int n= 112;
    
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