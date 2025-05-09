package BasicMaths;

import java.util.Scanner;

public class GcdOrHcf {
    public GcdOrHcf(){
        //Time Complexity = O(min(n1,n2)) - GCD
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //Brute force method - GCD
        for(int i = Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("GCD: "+i);
                break;
            }
        }
        System.out.println();

        //Euclidean method
        //Time Complexity = O(log base phi power min(n1,n2))
        while(n1>0 && n2>0){
            if(n1>n2)
                n1 = n1%n2;
            else
                n2 = n2%n1;
        }
        if(n1==0)
            System.out.println(n2);
        else
            System.out.println(n1);
    }
}
