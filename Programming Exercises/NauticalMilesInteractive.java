/*
 * Created by Zola on 7/08/2016.
 */
import javax.swing.JOptionPane;
public class NauticalMilesInteractive
{
    public static void main(String[] args) {
        String nauticalMilesString;
        nauticalMilesString = JOptionPane.showInputDialog(null, "Enter distance in nautical miles:");
        final double KILOMETRES, MILES;
        KILOMETRES = 1.852;
        MILES = 1.150779;
        double nautical_miles,nauticalMilesInKm, nauticalMilesInMiles;
        nautical_miles = Double.parseDouble(nauticalMilesString);
        nauticalMilesInKm = KILOMETRES * nautical_miles;
        nauticalMilesInMiles = MILES * nautical_miles;
        JOptionPane.showMessageDialog(null, "There are " + nauticalMilesInKm + " km and "
                + nauticalMilesInMiles + " miles in " + nautical_miles + " nautical miles");
    }
}
