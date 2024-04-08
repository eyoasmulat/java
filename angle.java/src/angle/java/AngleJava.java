import java.util.Scanner;
public class AngleJava {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        double num1=x.nextInt();
        double num2=x.nextInt();
        double num3=x.nextInt();
        double sum=num1+num2+num3;
        
           // System.out.println("SUM" + sum );
            
       
        if(sum==180){
            System.out.println("the sum of angle is the triangle");
        }
             else{
            System.out.println("it is not triangle");
                     
        }
       
        
        
        
    }
    
}
