import java.util.Scanner;
public class leapYear {
    public  static void checkLeap(int year){
        if(year%4==0){
            System.out.println("this is leap year. ");
        }else {
            System.out.println("This is not leap year. ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = obj.nextInt();
        checkLeap(year);
    }
}
