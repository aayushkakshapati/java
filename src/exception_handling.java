import java.lang.reflect.Array;

public class exception_handling{

    public static void main(String[] args) {
    /*   for exception handling
      try {
            int a = 120/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
    }  */
        // for array exception handling
        try {
            int a[] = {1,2,3};
           System.out.println(a[6]);

        }  catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error occurs");
        }
        finally {
            System.out.println("here we print final one.");
        }
    }
}
