import java.util.*; 
class Calc
{ 
    public static void main(String args[])
    {
        int num,sum=0, rem;
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter any no");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of digit="+sum);
    }

    }

    

