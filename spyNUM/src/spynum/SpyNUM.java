
package spynum;
import java.util.Scanner;
public class SpyNUM {

   
    public static void main(String[] args) {
         Scanner men=new Scanner(System.in);
        System.out.println("enetr a number");
          int d=men.nextInt();
         int sum=0;
         int product=1;
           int temp=d;
          while(temp>0){
          int digit=temp%10;
          sum=sum+digit;
          product=product*digit;
          temp/=10;
          
          }
          if(sum==product){
              System.out.print("it is spy number");
          }
          else{
            System.out.print("it is not spy number");  
          }
    }
    
}
