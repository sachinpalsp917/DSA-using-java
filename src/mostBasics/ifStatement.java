package mostBasics;

import java.util.Scanner;

public class ifStatement {
    public ifStatement(){
        // if Statement - performs a block of code if its condition is true

        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age >= 0 && age <= 11) {
//            System.out.println("Child");
//        } else if (age >= 12 && age <= 17) {
//            System.out.println("Teen");
//        } else if (age >= 18 && age <= 64) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Senior");
//        }

        String name = sc.nextLine();

        if (name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else {
            System.out.println("Your name is "+name);
        }
    }
}
