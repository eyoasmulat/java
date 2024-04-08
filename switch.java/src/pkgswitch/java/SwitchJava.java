
package pkgswitch.java;


public class SwitchJava {

   
    public static void main(String[] args) {
        int sizeNumber=3;
        switch(sizeNumber){
            case 1:
                System.out.println("extra small");
                break;
                 case 2:
                System.out.println("small");
                break;
                 case 3:
                System.out.println("medium");
                 case 4:
                System.out.println("large");
                 case 5:
                System.out.println("extra large");
                break;
                 default:
                System.out.println("invalid size number");
        }
       
    }
    
}
