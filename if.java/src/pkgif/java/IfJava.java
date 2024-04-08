
 
public class IfJava {

   public static void main(String[] args) {
       int number=-6;
       if(number>0){
           if(number%2==0){
           System.out.println("the number is positive and even");
           }else{
            System.out.println("the number is positive and odd");
           }
       }
       else if(number<0){
            if(number%2==0){
           System.out.println("the number is negative and even");
           }else{
            System.out.println("the number is negative and odd");
           }
           
       
   //System.out.println("the  number is negative");
   }
       else{
       
        System.out.println("the  number 0");
       }
       System.out.println("the programm is end");
    }
    
}
