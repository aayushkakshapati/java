import java.util.Scanner;
public class lo_op {
    int i;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = s.nextInt();
        System.out.println("loop");
        int x = s.nextInt();
        for (int i = 0; i < x; i++) {

            System.out.println(num);
        }
    }
}
