package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* In this we will be learning basic hashing now what is hashing its pre-fetching/fetching
        *   suppose we are given an array [1,2,3,1,2] now we have to check how many times each no appears inside the array
        * for eg: 1 appears 2 times 2 -> 2times 3 -> 1 time now if we write a code for it, we have manually check for each
        * element inside the array and there comes the hashing it creates a hashed array and store each element's count so
        * when we needed we have to use the hashed array, and we will get the result.
        * */

//        this was done for numbers only

        int n = 5;
        int[] arr = {1,3,2,1,3};
        // Precompute frequency using a fixed-size hash array
        int[] hash = new int[13]; // handles values from 0 to 12

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Read number of queries
        int q = 5;
        int[] number = {1,4,2,3,12} ;
        for (int num:number) {
//            System.out.println(hash[num]); // Output frequency
        }

        //same as above but using hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num: map.keySet()){
//            System.out.println(num+" occured "+map.get(num)+ " times");
        }


        //now let's do the same for string containing lowercase alphabets

        String s = "abcdabehf";
//        String s = "ASDFGcvbnDFGH cvb";

        //precompute
//        int[] hash1 = new int[26];//this is for lowercase alphabets only
        int [] hash1 = new int[256]; // this is for whole ASCII case

        for (int i=0;i<s.length();i++){
            hash1[s.charAt(i)]++;
        }

        int r = 5;
        char[] c = {'a','g','h','b','c'};
        for(int num:c){
            System.out.println(hash1[num]);
        }

        //now we do it using hashmap

        HashMap<Character,Integer> map1 = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for (char k: c){
            if (map1.containsKey(k)){
                System.out.println(k+" occured "+map1.get(k)+" times");
            }else{
                System.out.println(k+" occured 0 times");
            }
        }

    }
}
