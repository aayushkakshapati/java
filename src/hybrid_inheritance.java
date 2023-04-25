import java.util.Scanner;
public class hybrid_inheritance {  //if we use final instead of public, we cannot use the property of inheritance.
    String X;
    public  void a(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your date of birth:");
        int num =s.nextInt();
    }
}
class herit1 extends hybrid_inheritance {
    public void b(){
        System.out.println("This is second class");
    }
}
class herit2 extends hybrid_inheritance {
    public void c(){
        System.out.println("This is second class");
    }
}
class heritance {
    public static void main(String[] args) {
        herit1 h1 = new herit1();
        h1.a();
        herit2 h2 = new herit2();
        h2.a();
    }
}