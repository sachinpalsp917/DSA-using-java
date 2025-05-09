package BasicMaths;

import java.util.Scanner;

public class countDigits {
    public countDigits(){
        //Extraction of Digits
        int lastDigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
            count++;
        }
        System.out.println();
        System.out.println(count);

        //another method for count of Digits
        int a = sc.nextInt();
        int m = (int)(Math.log10(a)+1);
        System.out.println(m);
    }
}
