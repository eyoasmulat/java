import java.util.Scanner;
//package swap.java;
public class SwapJava {
public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("enter a two number");
    int num1 =x.nextInt();
    int num2 =x.nextInt();
    int temp;
    
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println(+ num1);
     System.out.println(+ num2);
      
      
        
    }
    
}
