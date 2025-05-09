import BasicRecursion.PrintSomethingNTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
       // Patterns p = new Patterns();
//        p.p1();
//        p.p2();
//        p.p3();
//        p.p4();
//        p.p5();
//        p.p6();
//        p.p7();
//        p.p8();
//        p.p9();
        //Arithmetic arth = new Arithmetic();
        //ShoppingCart s = new ShoppingCart();
        //ifStatement ifs = new ifStatement();
        //randomClass rc = new randomClass();
        //MathClass m = new MathClass();
        //printfStat pS = new printfStat();
        //string s = new string();
        //countDigits c = new countDigits();
        //ReverseNumber r = new ReverseNumber();
        //CheckPallindrome c = new CheckPallindrome();
        //ArmstrongNumber a = new ArmstrongNumber();
        //PrintAllDivisors p = new PrintAllDivisors();
        //CheckAllPrimeNumbers c = new CheckAllPrimeNumbers();
        //GcdOrHcf g = new GcdOrHcf();
        PrintSomethingNTimes p = new PrintSomethingNTimes();
        //p.CallSomething(20);
        //p.print1ToN(5);
        //p.Nto1recursion(5);
        //p.SumNnumbers(5);
        //p.Fact(5);
        //int[] a = {1,2,3,4,5,6};
        //int n = 6;
        //p.reverseArray(0, a,n);
        //for (int i=0;i<n;i++)
            //System.out.print(a[i]+" ");
        //String n = "11211";
        //System.out.println(p.checkPalindromeString(0,n));
        //System.out.println(p.Fibonacci(6));
        //System.out.println(Math.abs(-10.12));

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(5);
//        list.sort(new MyComparator());
//        System.out.println(list);

        ArrayList<String> aS = new ArrayList<>(Arrays.asList("Cat","Dog","Elephant"));
        System.out.println(aS);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.get(2));
        ll.addLast(4);
        ll.addFirst(0);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeIf(x->x%2==0);
        System.out.println(ll);

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("Dog","Lion"));
        ll1.removeAll(ll2);
        System.out.println(ll1);


    }
}