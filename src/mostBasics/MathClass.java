package mostBasics;

import java.util.Scanner;

public class MathClass {
    public MathClass(){
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;
        result = Math.pow(2,9);//power
        result = Math.abs(-5);//distance from zero
        result = Math.sqrt(9);//square root
        result = Math.round(3.83);//convert to nearest whole number
        result = Math.ceil(3.03);//upper value

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumfrence;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circumfrence = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius,2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("The circumference is: %.1fcm\n",circumfrence);
        System.out.printf("The area is: %.1fcm²\n",area);
        System.out.printf("The volume is: %.1fcm³\n",volume);
    }
}
