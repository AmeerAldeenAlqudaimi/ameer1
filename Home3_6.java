import java.util.Scanner;

public class Home3_6 {
    public static void main(String[] args) {

        int x, z, h;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the num1 :");
        x = num.nextInt();
        System.out.println("enter the num2  :");
        h = num.nextInt();
        System.out.println("enter the num3 :");
        z = num.nextInt();
        System.out.println(x+""+h+""+z);
        if(x>h&&h>z)
            System.out.println("increasing.");
        else if(x<h&&h<z)
            System.out.println("decreasing.");
        else
            System.out.println("neither.");

    }
}