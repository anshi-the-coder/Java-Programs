import java.util.*;
 class Largest
 {
    public static void main(String args[])
    {
        int x,y,z;
        System.out.println("enter three integers");
        Scanner  in = new  Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x>y && x>z)
        System.out.println("first no is largest");
        else if(y>x && y>z)
        System.out.println("second no is largest");
        else if(z>x && z>y)
        System.out.println("third no is largest");
        else
        System.out.println("entered no are not distinct");
    }
 }

    

