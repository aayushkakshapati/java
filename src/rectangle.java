import java.util.Scanner;

public class rectangle {
    public static void perimeter( int length,int breadth){
        System.out.println("the perimeter of rectangle is: "+ (2*length*breadth));
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int len = obj.nextInt();
        System.out.println("Enter Breadth: ");
        int bre = obj.nextInt();
        perimeter(len,bre);
    }
}
