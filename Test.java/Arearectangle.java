import java.util.*;

public class  Arearectangle
 {
    public static void main(String args[])
    {
        int l,b,area;
        System.out.println("area of rectangle");
        Scanner  sc=new  Scanner(System.in);
        l= sc.nextInt(args[0]);
        b= sc.nextInt(args[1]);
        area=l*b;
        System.out.println("area of rectangle"+ area);
    }

    
}
