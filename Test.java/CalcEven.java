import java.util.*;
public class CalcEven
{
    public static void main(String args[])
    {
        int a[]=newint[10];
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any 10 number");
        for(i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                sum=sum+a[i];

            }
            System.out.println("sum of even no="+sum);
        }

    }
}
    

