
import java.util.Scanner;
public class ScorrrJava {

    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the student mark");
        double num=x.nextInt();
        if(num>=85 && num<=100)
        {
        System.out.println("the grade is A " );
        System.out.println("EXCELLENT" );
    }
        else if(num>=70 && num<85)  {
            System.out.println("the grade is B" );
            System.out.println("very good " );
        }
        else if(num>=55 && num<70)  {
            System.out.println("the grade is C " );
            System.out.println("good " );
        }
        else if(num>=45 && num<55)  {
            System.out.println("the grade is D " );
            System.out.println("satisfactory " );
        }
        else  {
            System.out.println("the grade is F" );
            System.out.println("fail " );
        }
    }
    
}
