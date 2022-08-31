import java.util.Scanner;

public class Home3_3 {
    public static void main(String[] args) {
        int h;

        Scanner num = new Scanner(System.in);
        System.out.println("enter the num h :");
        h = num.nextInt();
        if(h>0)
            System.out.println("positive");
        else if(h<0)
            System.out.println("negative");
        else
            System.out.println("0");
    }

}
