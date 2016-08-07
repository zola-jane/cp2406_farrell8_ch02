/*
 * Created by Zola on 7/08/2016.
 */
import javax.swing.JOptionPane;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        String lengthString;
        lengthString = JOptionPane.showInputDialog(null, "Enter number of inches:");
        final int INCHES = 12;
        int lengthInInches, numberOfFeet, numberOfInches;
        lengthInInches = Integer.parseInt(lengthString);
        numberOfFeet = lengthInInches / INCHES;
        numberOfInches = lengthInInches % INCHES;
        JOptionPane.showMessageDialog(null, lengthInInches + " inches is equivalent to " + numberOfFeet + " feet and " + numberOfInches + " inches");
    }
}
