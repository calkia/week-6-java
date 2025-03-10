/**
 * Kiana Tjon
 * 3/10/25
 * Taxi
 */
import java.util.*;
public class Taxi{
    public static void main(String[] args) {
        int numPassengers;
        int numTaxi;
        int leftoverPassengers;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of passengers: ");
        numPassengers = input.nextInt();

        leftoverPassengers = numPassengers % 4;
        numTaxi = (numPassengers-leftoverPassengers)/4;

        System.out.println(numTaxi + " cabs will be required");
        System.out.println(leftoverPassengers + " passengers(s) will be left over");


    }
}