import java.util.*;

public class CaptalizeWord {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String word = sc.nextLine();
     if(word.length()>0){
    String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    System.out.println(capitalizedWord);
     }
  }
}