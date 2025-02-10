import java.util.*;
class Even
{
    public static void main(String args[])
    {
        int x;
        System.out.println("enter an integer to check if it is odd or even");
        Scanner in = new  Scanner(System.in);
        x=in.nextInt();
        if(x%2==0)
        System.out.println("you entered an even number");
        else
        System.out.println("you entered an odd number");

    }
}
    

