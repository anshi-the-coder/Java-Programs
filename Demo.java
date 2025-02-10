public class Demo  
{
    public static void main(String args[])
    {
        int a=5;
        int b=7;
        int c=a++ +b;
        System.out.println("post inrement\n c=" +c);
        int A=5;
        int B=7;
        int C= ++A+B;
        System.out.println("pre increment\nC=" +C);
        int m=1, n=2;
        int o=m++ +n + ++m;
        System.out.println("example\n o=" +o);
    
}
}
