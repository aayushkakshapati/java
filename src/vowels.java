import java.util.Scanner;

public class vowels {
    public static void alpha(char letter){
        if (letter=='a'||letter=='e'|| letter=='i'|| letter=='0' || letter=='u'){
            System.out.println("the given character is vowel");
        }
        else {
            System.out.println("the given character is composite. ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any letter: ");
        char letter = obj.next().charAt(0); // input type for character
        alpha(letter);
//        System.out.println(letter);
    }
}
