import java.util.*;

public class Arithmatic {

    public int add(int a, int b)
    {
        return (a+b);
    }
    public int sub(int a, int b)
    {
        return (a-b);
    }
    public int multiply(int a, int b)
    {
        return (a*b);
    }
    public int div(int a, int b)
    {
        return (a/b);
    }

    public static void main(String[] args) {
        Arithmatic obj = new Arithmatic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition = "+obj.add(a, b));
        System.out.println("Subtraction = "+obj.sub(a, b));
        System.out.println("Multiplication = "+obj.multiply(a, b));
        System.out.println("Division= "+obj.div(a, b));
    }

}
