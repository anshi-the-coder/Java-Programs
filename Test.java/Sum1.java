import java.util.*;
public class Sum1 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 number");
        for(i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];

        }
        System.out.println("sum of elements="+sum);
    }
}
