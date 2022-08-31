import java.util.Scanner;

public class Home3_2 {  public static void main(String[] args) {
    String x;
    int h;
    Scanner in = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    System.out.println("enter the chr x :");
    x = in.next();
    System.out.println("enter the num h :");
    h = num.nextInt();
    if (x.equals("a")||x.equals("c")||x.equals("e")||x.equals("g"))
    {
        if(h==1||h==3||h==5||h==7)
            System.out.println("blak");
        else if(h==2||h==4||h==6||h==8)
            System.out.println("with");
        else
            System.out.println("eror in enter");
    }
    else if (x.equals("b")||x.equals("d")||x.equals("f")||x.equals("h"))
    {
        if(h==1||h==3||h==5||h==7)
            System.out.println("with");
        else if(h==2||h==4||h==6||h==8)
            System.out.println("blac");
        else
            System.out.println("eror in enter");
    }
    else System.out.println("eror in enter");
}
}