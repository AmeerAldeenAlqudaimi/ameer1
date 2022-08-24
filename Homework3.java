import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        double f,g,h,j;
        Scanner Rectangle=new Scanner(System.in);
        System.out.println("enter the f :");
        f=Rectangle.nextDouble();
        System.out.println("enter the g :");
        g=Rectangle.nextDouble();
        h=f*g;
        System.out.println(" Area  :"+h);
        j=(f*g)/2;
        System.out.println("perimeter  :"+j);
    }
}
