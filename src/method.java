public class method {
    int a = 5; //this variable is declared outside the function.
    public static void f1(String str){
        System.out.println(str);

    }
    public static void main(String arg[]){
        String str = "aayush"; // this variable string is declared inside the function.
        f1(str);
    }
}
