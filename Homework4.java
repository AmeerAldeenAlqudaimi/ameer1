import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int k,l,m,n;
        Scanner Average=new Scanner(System.in);
        System.out.println("enter the first numbers :");
        k=Average.nextInt();
        System.out.println("enter the second numbers :");
        l=Average.nextInt();
        System.out.println("enter the third numbers :");
        m=Average.nextInt();
        n=(k+l+m)/3;
        System.out.println("thr Average :"+n);



    }
}
