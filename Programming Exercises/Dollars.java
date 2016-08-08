/*
 * Created by Zola on 8/08/2016.
 */
import java.util.Scanner;
public class Dollars
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount >>>");
        int amount;
        amount = input.nextInt();
        int twenties, tens, fives, ones;
        twenties = amount / 20;
        tens = (amount % 20) / 10;
        fives = (amount % 10) / 5;
        ones = amount % 5;
        System.out.println("" + twenties);
        System.out.println("" + tens);
        System.out.println("" + fives);
        System.out.println("" + ones);


    }
}
