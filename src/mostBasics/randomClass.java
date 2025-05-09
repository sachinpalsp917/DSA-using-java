package mostBasics;

import java.util.Random;

public class randomClass {
    public randomClass(){
        Random r = new Random();
        int num = r.nextInt(1,101);
        System.out.println(num);

        double num1 = r.nextDouble(1,100);
        System.out.println(num1);

        boolean num2 = r.nextBoolean();
        System.out.println(num2);
    }
}
