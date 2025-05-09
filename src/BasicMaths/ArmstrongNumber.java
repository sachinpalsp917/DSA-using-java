package BasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public ArmstrongNumber(){
        int lastDigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();
        int dup = n;
        int sum = 0;
        while(n>0){
            lastDigit = n%10;
            sum += Math.pow(lastDigit,3);
            n = n/10;
        }
        if(sum == dup)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
