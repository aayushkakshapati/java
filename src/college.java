 public class college {
    int id;
   String  name;
    String faculty; 
    public static int myMethod(){
        System.out.println("This is inside myMethod1");
        return 10;
    }
    public static void myMethod2(){
        college c1 = new college();
        System.out.println("This is inside myMethod2");
        System.out.println(c1.myMethod());
    }
    public static void main(String[] args) {
        college c2 = new college();
        c2.myMethod();
        c2.myMethod2();
    }
}
