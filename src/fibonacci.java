public class fibonacci {
    public static void fibonacci(int n){
        int a,b,c;
        a=0;
        b=1;
        c=0;
        for(int i=0;i<n;i++){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;

        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
