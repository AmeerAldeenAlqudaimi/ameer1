import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int e,r,o;
        Scanner swap=new Scanner(System.in);
        System.out.println("enter the first numbers e:");
        e=swap.nextInt();
        System.out.println("enter the second numbers r:");
        r=swap.nextInt();
        System.out.println("\n");
        o=e;
        e=r;
        r=o;
        System.out.println("e="+e);
        System.out.println("r="+r);
    }
}
