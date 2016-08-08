/*
 * Created by Zola on 8/08/2016.
 */
import javax.swing.JOptionPane;
public class Eggs
{
    public static void main(String[] args)
    {
        String orderString;
        orderString = JOptionPane.showInputDialog(null, "Enter number of eggs:", "Order", JOptionPane.INFORMATION_MESSAGE);
        final double SINGLE_PRICE, DOZEN_PRICE;
        SINGLE_PRICE = 0.45;
        DOZEN_PRICE = 3.25;
        int numberOfEggs, eggsInDozen, eggsInSingle;
        numberOfEggs = Integer.parseInt(orderString);
        eggsInDozen = numberOfEggs / 12;
        eggsInSingle = numberOfEggs % 12;
        double totalPrice = (DOZEN_PRICE * eggsInDozen) + (SINGLE_PRICE * eggsInSingle);
        JOptionPane.showMessageDialog(null, "You ordered " +  numberOfEggs + " eggs. That's "
            + eggsInDozen + " dozen at $" + DOZEN_PRICE + " per dozen and " + eggsInSingle
            + " loose eggs at $" + SINGLE_PRICE + " each for a total of $" + totalPrice + ".");

    }
}
