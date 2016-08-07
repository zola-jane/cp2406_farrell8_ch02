/*
 * Created by Zola on 7/08/2016.
 */
public class NauticalMiles
{
    public static void main(String[] args) {
        final double KILOMETRES, MILES;
        KILOMETRES = 1.852;
        MILES = 1.150779;
        double nautical_miles, nauticalMilesInKm, nauticalMilesInMiles;
        nautical_miles = 15.0;
        nauticalMilesInKm = KILOMETRES * nautical_miles;
        nauticalMilesInMiles = MILES * nautical_miles;
        System.out.println("There are " + nauticalMilesInKm + " km and "
            + nauticalMilesInMiles + " miles in " + nautical_miles + " nautical miles");
    }
}
