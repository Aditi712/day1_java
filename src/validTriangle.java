import java.util.*;
public class validTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter 3 angles of triangles");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        if(a+b+c==180 && a!=0 && b!=0 && c!=0)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");
        }
    }
}
