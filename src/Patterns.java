public class Patterns {
    int n = 4;
    int m = 5;
    public void p1(){
        //rectangle pattern
        for(int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void p2(){
    // hollow rectangle
        for(int i=1; i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j==1 || i == n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void p3(){
        //half pyramid
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p4(){
        //inverted half pyramid
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public void p5(){
        //inverted half pyramid rotated by 180 degrees
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p6(){
        //half pyramid with numbers
        for(int i=1;i<=n;i++){
            for (int j = 1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
    public void p7(){
        //inverted half pyramid with numbers
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void p8(){
        //floyd's triangle
        int number = 1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public void p9(){
        //0-1 triangle
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if (sum%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
