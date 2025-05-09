package BasicMaths;

import java.util.Scanner;

public class CheckAllPrimeNumbers {
    public CheckAllPrimeNumbers(){
        //Time Complexity = O(n) Brute force method
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("not a prime number");

        //Time Complexity = O(sqrt(n))
        count = 0;
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i)
                    count++;
            }
        }
        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("not a prime number");

    }
}
