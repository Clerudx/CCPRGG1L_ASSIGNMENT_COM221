import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        myOrder();
        

        scan.close();
    }

    static int multiply() {
        System.out.println("This method will get the product of two numbers");
        System.out.println("Enter number 1: ");
        int x = scan.nextInt();

        System.out.println("Enter number 2: ");
        int y = scan.nextInt();

        return x * y;
    }

    static int divide() {
        System.out.println("This method will get the quotient of two numbers");
        System.out.println("Enter number 1: ");
        int x = scan.nextInt();

        System.out.println("Enter number 2: ");
        int y = scan.nextInt();

        return x / y;
    }

    static void myOrder () {
        System.out.println("This is KFC, what are your orders?");
        String order1 = scan.nextLine();
        System.out.println("Price: ");
        Double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your second order: ");
        String order2 = scan.nextLine();
        System.out.println("Price: ");
        Double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your third order: ");
        String order3 = scan.nextLine();
        System.out.println("Price: ");
        Double price3 = scan.nextDouble();

        Double total = price1 + price2 + price3;

        System.out.println("Your orders are...: " + order1 + ", " + order2 + " and " + order3);
        System.out.println("Total price...: "  + total);
    }

}
