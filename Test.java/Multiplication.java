import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter [3][3] in matrix");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=0;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println("enter [3][3] in matrix");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    c[i][j]=0;

                }
                for(k=0;k<=2;k++)
                {
                    c[i][j]=c[i][j]+a[i][j]*b[i][j];
                }
            }
System.out.println("printing multiplication");
for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++)
    {
        System.out.println(c[i][j]+"");
    }
    System.out.println();
}
}
        }
    }
}