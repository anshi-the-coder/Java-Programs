import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int year=sc.nextInt();
      
      for(int i=year+1;true;i++){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int temp=i;
        while(temp>0){
          int rem=temp%10;
          freq.put(rem, freq.getOrDefault(rem, 0) + 1); // here rem represents a remainder or a number 
          // here 0 is a default value
          temp=temp/10;
        }
        
        Boolean flag=true;
        for(int key:freq.keySet()){
          if(freq.get(key)!=1){
            flag=false;
          }
        }
        
        
        if(flag){
          System.out.println(i);
          break;
        }
      }
      
  }
}