import java.util.*;
 
public class UpperCount {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int upperCount = 0;
      char[] charArray = s.toCharArray();
      for(int i =0;i<charArray.length;i++){
         char ch = charArray[i];
       if (Character.isUpperCase(ch)) {
        upperCount++;
         
       } 
      }
      System.out.println(upperCount > s.length() / 2 ? s.toUpperCase() : s.toLowerCase());
  }
}