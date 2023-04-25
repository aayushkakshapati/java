/* algo
* for(i=2;i<=n/2;i++){}
* if(n%i==0){
* prime
* }*/

import java.util.Scanner;

public class isPrime {
    int flag;
    public void checkPrime(int num){
        for(int index = 2; index<=num/2;index++){
            if(num%index==0){
                flag = 1 ;
            }else{
                flag = 0;
            }
        }
        if (flag == 0){
            System.out.println(num+ " is prime number.");
        }else {
            System.out.println(num+  " is not prime number.");
        }
    }
    public static void main(String[] args) {
        isPrime p1 = new isPrime();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =s.nextInt();
        p1.checkPrime(num);
    }
}
