
package sum;
import java.util.Scanner;

public class Sum {

   
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      System.out.println("enter a number");
      int n=x.nextInt();
      int fact=1;
      int i=1;
      while(i<=n){
          fact=fact*i;
          
      System.out.println(fact);
          i++;
              
      }
    }
    
}
