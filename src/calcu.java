import java.util.Scanner;

public class calcu {

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
            System.out.println("Addition of a and b is "+ addition(a,b)); // here we uce concatenation which add two or more strings togther to create a new string.
            System.out.println("subtracation of a and b is "+ subtraction(a,b));
            System.out.println("multiplication of a and b is "+ multiplication(a,b));
            System.out.println("division of a and b is "+ division(a,b));

        }
    }



