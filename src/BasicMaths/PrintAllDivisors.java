package BasicMaths;

import java.util.Scanner;

public class PrintAllDivisors {
    public PrintAllDivisors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Divisor: ");
        int n = sc.nextInt();

        //Time Complexity = O(n)
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //Time complexity = O(sqrt(n))
        for (int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                System.out.print(i + " ");
                if((n/i)!=i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
