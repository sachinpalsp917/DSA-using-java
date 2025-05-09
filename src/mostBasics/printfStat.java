package mostBasics;

public class printfStat {
    public printfStat(){
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

//        System.out.printf("Hello %s\n",name);
//        System.out.printf("Your name starts with letter %c\n",firstLetter);
//        System.out.printf("You are %d years old\n",age);
//        System.out.printf("You are %.1f inches tall\n",height);
//        System.out.printf("Employed %b\n",isEmployed);

        //all in one line
        //System.out.printf("Hello %s. Your name starts with letter %c and you are %d years old. Your height is %.1f inches tall. And you are employed is %b",name,firstLetter,age,height,isEmployed);

        //[flags]

        // + = Output a plus
        // , = comma grouping
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

//        System.out.printf("% .1f\n",price1);
//        System.out.printf("% .1f\n",price2);
//        System.out.printf("% .1f\n",price3);

//        [width]
//        0 = zero padding
//        number = right justified padding
//        negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);


    }
}
