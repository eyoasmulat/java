import java.util.Scanner;

//package des.java;

public class DesJava {

  
    public static void main(String[] args) {
      
       Scanner x=new Scanner(System.in);
       System.out.println("enter the length:");
       int num1 =x.nextInt();
       System.out.println("enter the width:");
        int num2 =x.nextInt();
       int area;
       System.out.println("area of rectangle= " + num1*num2 );
       System.out.println("area of triangle= " + 0.5*(num1*num2));
       
    }
    
}
