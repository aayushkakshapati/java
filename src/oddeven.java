import java.util.Scanner;
// program to check the given number is odd or even

public class oddeven {
    public static void isEven(int num1){
        if(num1%2==0){
            System.out.println("The given number is even.");
        } else {
            System.out.println("the given number is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = obj.nextInt();
        isEven(num);
    }
}
