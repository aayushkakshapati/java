import java.util.Scanner;

public class simpleInterest {
    public static void money(float principle, float time, float rate){
        float SI;
        SI = (principle*time*rate)/100;
        System.out.println("Simple Interest is "+ SI);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Principle");
        float p = obj.nextFloat();
        System.out.println("Enter Time");
        float t = obj.nextFloat();
        System.out.println("Enter Rate");
        float r = obj.nextFloat();
        money(p,t,r);
    }
}
