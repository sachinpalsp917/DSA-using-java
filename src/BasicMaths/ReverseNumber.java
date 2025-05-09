package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public ReverseNumber(){
        int lastDigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();

        int revNum = 0;
        while(n>0){
            lastDigit = n%10;
            n = n/10;
            revNum = (revNum*10)+lastDigit;
        }
        System.out.println(revNum);
    }
}
