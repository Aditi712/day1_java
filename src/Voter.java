import java.util.*;

public class Voter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = in.nextInt();
        if (age>18)
        {
            System.out.println("you are ELIGIBLE vote.");
        }
        else {
            System.out.println("You are NOT ELIGIBLE to vote");
        }
    }
}
