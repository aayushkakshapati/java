import java.util.Scanner;

public class swap {
    public static void usingtempVar(int num1, int num2){
        int temp;
        temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("Using temp variable num1 = "+ num1 + " num2 = "+ num2);
    }
    public static void notUsingTempVar(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Without using temp variable num1 = "+ num1 + " num2 = "+ num2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = s.nextInt();
        System.out.println("enter the second number:");
        int num2 = s.nextInt();
        usingtempVar(num1,num2);
        notUsingTempVar(num1,num2);
    }
}
