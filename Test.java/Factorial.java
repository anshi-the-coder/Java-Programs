import java.util.*; 

class Factorial
{
    public static void main(String arga[])
    {
        int n,c,fact=1;
        System.out.println("enter an integer to calculate it's factorial");
        Scanner  in = new  Scanner(System.in);
        n=in.nextInt();
        if(n<0)
        System.out.println("number should be non-negative");
        else
        {
            for(c=1; c<=n; c++)
            fact=fact*c;
            System.out.println("factorial of "+ n +"is ="+fact);
        }
    }
}
    

