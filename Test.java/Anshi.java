import java.util.*;
public class Anshi {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.println("*");
                    else {
                        System.out.println("");
                        System.out.println();
                    }
                }
            }
        }
    }

}
