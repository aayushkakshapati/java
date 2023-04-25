import java.util.Scanner;
public class advanced_calculator{
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static float division(int a, int b){
        return (float) a/b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = input.nextInt();
        System.out.println("enter second number:");
        int b = input.nextInt();
        System.out.println("enter 1:addition 2:subtraction 3:multiplication 4:divison :");
        int c = input.nextInt();
        input.close();

        //using if else statement
       /* if(c==1){
            System.out.println("Addition of a and b is "+ addition(a,b));
        }
        else if (c==2) {
            System.out.println("subtraction of a and b is "+ subtraction(a,b));
        }
        else if (c==3) {
            System.out.println("multiplication of a and b is "+ multiplication(a,b));
        } else if (c==4) {
            System.out.println("division of a and b is "+ division(a,b));
        }
        else{
            System.out.println("invalid");
        }
        */


     //  using switch case
       switch (c){
           case 1: System.out.println("Addition of a and b is "+ addition(a,b));
           break;
           case 2: System.out.println("subtraction of a and b is "+ subtraction(a,b));
               break;
           case 3:  System.out.println("multiplication of a and b is "+ multiplication(a,b));
               break;
           case 4: System.out.println("division of a and b is "+ division(a,b));
               break;
           default:
               System.out.println("your input is invalid");
               break;
       }
    }
}


