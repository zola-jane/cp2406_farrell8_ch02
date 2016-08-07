/*
 * Created by Zola on 7/08/2016.
 */
public class InchesToFeet
{
    public static void main(String[] args)
    {
        final int INCHES = 12;
        int lengthInInches, numberOfFeet, numberOfInches;
        lengthInInches = 86;
        numberOfFeet = lengthInInches / INCHES;
        numberOfInches = lengthInInches % INCHES;
        System.out.println(lengthInInches + " inches is equivalent to " + numberOfFeet + " feet and " + numberOfInches + " inches");
    }
}
