/*
 * Created by Zola on 7/08/2016.
 */
import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        String quartString;
        quartString = JOptionPane.showInputDialog(null, "Enter number of quarts needed for painting", "Quarts of Paint",
                JOptionPane.INFORMATION_MESSAGE);
        final int QUARTS_IN_GALLON = 4;
        int quartsOfPaint, numberOfGallons, numberOfQuarts;
        quartsOfPaint = Integer.parseInt(quartString);
        numberOfGallons = quartsOfPaint / QUARTS_IN_GALLON;
        numberOfQuarts = quartsOfPaint % QUARTS_IN_GALLON;
        JOptionPane.showMessageDialog(null, "A job that needs " + quartsOfPaint + " quarts requires " + numberOfGallons + " gallons plus " + numberOfQuarts + " quarts",
                "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
