import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
        int x,c;
        Scanner num=new Scanner(System.in);
        System.out.println("enter the num x :");
         x=num.nextInt();
         c=x*x;
        System.out.println(c);
        c=x*x*x;
        System.out.println(c);
      System.out.println(Math.pow( x, 4));
    }
}
