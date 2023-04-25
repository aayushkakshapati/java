import java.util.Scanner;
public class inherit {  //if we use final instead of public, we cannot use the property of inheritance.
    String X;
    public  void a(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your date of birth:");
        int num =s.nextInt();
    }
}
 class onherit extends inherit {
    public void b(){
        System.out.println("This is second class");
    }
}
class onherit2 extends onherit{
    public static void main(String[] args) {
        onherit2 o2 = new onherit2();
        o2.a();
        o2.b();
    }
}
