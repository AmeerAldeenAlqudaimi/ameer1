import java.util.Scanner;

public class Home3_5 {
    public static void main(String[] args) {

    int x,z,h;

        Scanner num = new Scanner(System.in);
    System.out.println("enter the num1  :");
    x = num.nextInt();
    System.out.println("enter the num2 :");
    h = num.nextInt();
    System.out.println("enter the num3 :");
    z = num.nextInt();
    if(z==x && x==h)
        System.out.println("all the same");
    else if(z!=x && x!=h && h!=z)
        System.out.println("all different");
else
        System.out.println("neither");

}
}

