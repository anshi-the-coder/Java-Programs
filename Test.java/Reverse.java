import java.util.*; 
class Reverse
{
    public static void main(String args[])
    {
        int num,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
           System.out.println("reverse of given digit"+rev);
    }
}

    

