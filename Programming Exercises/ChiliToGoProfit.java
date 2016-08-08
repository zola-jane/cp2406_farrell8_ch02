/*
 * Created by Zola on 8/08/2016.
 */

import javax.swing.*;

public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final double ADULT_MEAL, CHILD_MEAL, ADULT_PROFIT, CHILD_PROFIT;
        ADULT_MEAL = 7.0;
        CHILD_MEAL = 4.0;
        ADULT_PROFIT = 4.35;
        CHILD_PROFIT = 3.10;
        String adultOrderString, childOrderString;
        adultOrderString = JOptionPane.showInputDialog(null, "Enter number of order for adults:", "Adult Orders", JOptionPane.INFORMATION_MESSAGE);
        childOrderString = JOptionPane.showInputDialog(null, "Enter number of order for children:", "Child Orders", JOptionPane.INFORMATION_MESSAGE);
        int adultOrder, childOrder;
        adultOrder = Integer.parseInt(adultOrderString);
        childOrder = Integer.parseInt(childOrderString);
        double adultPrice, childPrice, totalPrice, adultPriceProfit, childPriceProfit, totalProfit;
        adultPrice = adultOrder * ADULT_MEAL;
        childPrice = childOrder * CHILD_MEAL;
        totalPrice = adultPrice + childPrice;
        adultPriceProfit = (adultPrice - (adultOrder * ADULT_PROFIT));
        childPriceProfit = (childPrice - (childOrder * CHILD_PROFIT));
        totalProfit = adultPriceProfit + childPriceProfit;
        JOptionPane.showMessageDialog(null, "You ordered " + adultOrder + " adult meals for a total of $" + adultPrice + " and "
                + childOrder + " child meals for a total of $" + childPrice + " with a grand total of $" + totalPrice);
        JOptionPane.showMessageDialog(null, "Profit for " + adultOrder + " adult meals is $" + adultPriceProfit + " and the profit for "
                + childOrder + " child meals is $" + childPriceProfit + " with a total profit of $" + totalProfit);
    }
}
