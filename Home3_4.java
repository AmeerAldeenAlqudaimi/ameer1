import java.util.Scanner;

public class Home3_4 {
    public static void main(String[] args) {
    double h;

    Scanner num = new Scanner(System.in);
    System.out.println("enter the num h :");
    h = num.nextDouble();
    if(h<0)
        h=h*-1;

    if(h>=1 && h<=9)
        System.out.println("this nmber  "+h+"  contains 1 digit" );
    else if(h>=10 && h<=99)
            System.out.println("this nmber  "+h+"  contains 2 digits" );
    else if(h>=100 && h<=999)
        System.out.println("this nmber   "+h+"  contains 3 digits" );
    else if(h>=1000 && h<=9999)
        System.out.println("this nmber  "+h+"  contains 4 digits" );
    else if(h>=10000 && h<=99999)
        System.out.println("this nmber  "+h+"  contains 5 digits" );
    else if(h>=100000 && h<=999999)
        System.out.println("this nmber"+h+"contains 6 digits" );
    else if(h>=1000000 && h<=9999999)
        System.out.println("this nmber  "+h+"  contains 7 digits" );
    else if(h>=10000000 && h<=99999999)
        System.out.println("this nmber  "+h+"  contains 8 digits" );
    else if(h>=100000000.0 && h<=999999999.0)
        System.out.println("this nmber  "+h+"  contains 9 digits" );
    else if(h>=1000000000.0 && h<=9999999999.0)
        System.out.println("this nmber  "+h+"  contains 10 digits" );
    else if(h>=10000000000.0 && h<=99999999999.0)
        System.out.println("this nmber  "+h+"  contains 11 digits" );
    else
        System.out.println("error" );
    }
}
