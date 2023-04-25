public class calculator {
    int a = 5;
    int b = 1;
    public static int addition(){
        calculator c1 = new calculator(); //this is object.
        return (c1.a + c1.b); // here we return the value .
    }
    public static int subtraction(){
        calculator c1 = new calculator();
        return (c1.a - c1.b);
    }
    public static int multiplication(){
        calculator c1 = new calculator();
        return (c1.a * c1.b);
    }
    public static int division(){
        calculator c1 = new calculator();
        return (c1.a / c1.b);
    }
    public static void main(String[] args){
        calculator c1 = new calculator();
        System.out.println("Addition"+ c1.addition()); // here we uce concatenation which add two or more strings togther to create a new string.
        System.out.println("subtracation"+ c1.subtraction());
        System.out.println("multiplication"+ c1.multiplication());
        System.out.println("division"+ c1.division());

    }
}

