import java.util.Scanner;

public class compoundInterest {
    public static void money(float principle, float time, float rate){
        float CI;
        CI = principle * ((1+rate)/100);Math.sqrt(time);
        System.out.println("Compound Interest is "+ CI);
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
