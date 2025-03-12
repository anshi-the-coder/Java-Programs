import java.util.*;

public class LuckyDigitCount {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String n = sc.nextLine();
      int luckyDigitCount =0;
      for(int i =0;i<n.length();i++){
        char ch = n.charAt(i);
        if(ch=='4'||ch=='7'){
          luckyDigitCount++;
          
        }
      }
      // Convert count to string and check if all digits are 4 or 7
        if (luckyDigitCount == 0) {
            System.out.println("NO");
            return;
        }
        
        boolean isLucky = true;
        int count = luckyDigitCount;
        while (count > 0) {
            int digit = count % 10;
            if (digit != 4 && digit != 7) {
                isLucky = false;
                break;
            }
            count /= 10;
        }
        if(isLucky){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
  }
}