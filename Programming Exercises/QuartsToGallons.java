/*
 * Created by Zola on 7/08/2016.
 */
public class QuartsToGallons
{
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartsOfPaint, numberOfGallons, numberOfQuarts;
        quartsOfPaint = 18;
        numberOfGallons = quartsOfPaint / QUARTS_IN_GALLON;
        numberOfQuarts = quartsOfPaint % QUARTS_IN_GALLON;
        System.out.print("A job that needs " + quartsOfPaint);
        System.out.print(" quarts requires " + numberOfGallons);
        System.out.print(" gallons plus " + numberOfQuarts + " quarts");

    }
}
