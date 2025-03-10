/**
 * Kiana Tjon
 * 3/20/25
 * Order
 */
import java.util.*;
import java.text.NumberFormat;
public class Order {
    public static void main(String[] args) {
        String name;
        int numBurgers;
        double burgerPrice;
        int numFries;
        double friesPrice;
        int numSodas;
        double sodaPrice;
        double total;
        double tax;
        double finalTotal;
        double tendered;
        double change;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter the number of burgers: ");
        numBurgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        numFries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        numSodas = input.nextInt();

        burgerPrice = numBurgers*1.69;
        friesPrice = numFries*1.09;
        sodaPrice = numSodas*0.99;
        total = burgerPrice + friesPrice + sodaPrice;
        tax = (total/100)*8.5;
        finalTotal = total + tax;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("\n\nTotal before tax: "+money.format(total));
        System.out.println("Tax: "+money.format(tax));
        System.out.println("Final Total: "+money.format(finalTotal));

        System.out.print("Enter the amount tendered: $");
        tendered = input.nextDouble();
        change = tendered - finalTotal;
        System.out.println("Change: "+money.format(change));

    }
}
