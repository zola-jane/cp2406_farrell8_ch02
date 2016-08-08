/*
 * Created by Zola on 8/08/2016.
 */
import javax.swing.JOptionPane;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        final double ADULT_MEAL, CHILD_MEAL;
        ADULT_MEAL = 7.0;
        CHILD_MEAL = 4.0;
        String adultOrderString, childOrderString;
        adultOrderString = JOptionPane.showInputDialog(null, "Enter number of order for adults:", "Adult Orders", JOptionPane.INFORMATION_MESSAGE);
        childOrderString = JOptionPane.showInputDialog(null, "Enter number of order for children:", "Child Orders", JOptionPane.INFORMATION_MESSAGE);
        int adultOrder, childOrder;
        adultOrder = Integer.parseInt(adultOrderString);
        childOrder = Integer.parseInt(childOrderString);
        double adultPrice, childPrice, totalPrice;
        adultPrice = adultOrder * ADULT_MEAL;
        childPrice = childOrder * CHILD_MEAL;
        totalPrice = adultPrice + childPrice;
        JOptionPane.showMessageDialog(null, "You ordered " + adultOrder + " adult meals for a total of $" + adultPrice + " and "
                + childOrder + " child meals for a total of $" + childPrice + " with a grand total of $" + totalPrice);

    }
}
