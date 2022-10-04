import java.util.*;
public class discount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter price : ");

        int price=sc.nextInt();

        System.out.println("Enter quantity: ");

        int quantity=sc.nextInt();

        int total_cost=quantity*price;

        int discount= (total_cost/100)*10;

        int net_amount=total_cost-discount;



        System.out.println("Price of one Item= "+price);

        System.out.println("Price of "+quantity+" Items= "+total_cost);

        System.out.println("10% discont on "+total_cost+" = "+discount);

        System.out.println("Net amount to be paid= "+total_cost+" - "+discount+" = "+net_amount);

    }
}
