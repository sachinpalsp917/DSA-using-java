package BasicRecursion;

import static java.util.Collections.swap;

public class PrintSomethingNTimes {
    //print something N times
    public void PrintSomething(int n){
        if (n == 0)
            return;
        System.out.println(n);
        n--;
        PrintSomething(n);
    }

    //print 1 to N using recursion
    int count = 1;
    public void print1ToN(int n){
        if(count == n+1)
            return;
        System.out.println(count);
        count++;
        print1ToN(n);
    }

    //print N to 1 using recursion
    public void Nto1recursion(int n){
      if(n==0)
          return;
      System.out.println(n);
      n--;
      Nto1recursion(n);
    }

    //Sum of first N numbers
    int sum=0;
    public void SumNnumbers(int n){
        if (n==0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        n--;
        SumNnumbers(n);
    }

    //Factorial of N numbers
    int fact = 1;
    public void Fact(int n){
        if(n==1) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        n--;
        Fact(n);
    }

    //reverse an array
    int temp;
    public void reverseArray(int i,int [] arr,int n){
        if(i>=n/2) return;
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverseArray(i+1,arr,n);
    }

    //Check if a given string is palindrome or not
    public boolean checkPalindromeString(int i, String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return checkPalindromeString(i+1,s);
    }

    //Fibonacci Series
    public int Fibonacci(int n){
        if(n<=1)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
