package BasicMaths;

import java.util.Scanner;

public class CheckPallindrome {
    public CheckPallindrome(){
        int lastDigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();
        int n1 = n;
        int revNum = 0;
        while(n>0){
            lastDigit = n%10;
            n = n/10;
            revNum = (revNum*10)+lastDigit;
        }

        if(n1 == revNum){
            System.out.println("Is a pallindrome");
        }else
            System.out.println("Is not a pallindrome");
    }
}
