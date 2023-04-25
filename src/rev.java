import java.util.Scanner;
public class rev {
        String str1 = "";
        char car;
        public void reverseStr(String str){
            for(int index = str.length() -1;index >= 0; index--){
                car = str.charAt(index);
                str1 += car;
            }
            System.out.println("the reverse of name without using inbuild is "+str1);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter name:");

            //inbuild
            String name = input.nextLine();
            StringBuilder aab = new StringBuilder();
            aab.append(name);
            System.out.println("the reverse of name using inbuild is:"+aab.reverse());

            // without using inbuild functions
            rev r1 = new rev();
            r1.reverseStr(name);


        }
    }

