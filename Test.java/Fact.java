import java.util.*; 

public class Fact
{
    public static void main(String args[])
    {
        int i=1,fact=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no");
        n=sc.nextInt();
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of given no="+fact);
        }
    }


    

