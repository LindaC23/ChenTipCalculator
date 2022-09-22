import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args){
        // creating Scanner and DecimalFormat objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // creating variables ( used later in the loop )
        double addedDish = 0;
        double totalCost = 0;

        // welcoming the user
        System.out.println("Welcome to the tip calculator!");

        // prompting the user to input values
        System.out.print("How many people are in your group? ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        // loop to calculate the total price
        while (addedDish != -1){
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end): ");
            addedDish = scan.nextDouble();
            totalCost += addedDish;
        }
        totalCost ++; // adding 1 to cancel out the -1 that gets added in the loop

        // making calculations and using the DecimalFormat object to round the decimals
        double tip = totalCost * (tipPercentage / 100.0);
        String formattedTip = formatter.format(tip);

        double costWithTip = tip + totalCost;
        String formattedCostWithTip = formatter.format(costWithTip);

        double costPerPersonWithoutTip = totalCost / numberOfPeople;
        String formattedCostPerPersonWithoutTip = formatter.format(costPerPersonWithoutTip);

        double tipPerPerson = tip / numberOfPeople;
        String formattedTipPerPerson = formatter.format(tipPerPerson);

        double totalCostPerPerson = tipPerPerson + costPerPersonWithoutTip;
        String formattedTotalCostPerPerson = formatter.format(totalCostPerPerson);

        // printing out all the required values
        System.out.println("----------------------");
        System.out.println("Total Bill Before Tip: " + totalCost);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + formattedTip);
        System.out.println("Total Bill With Tip: " + formattedCostWithTip);
        System.out.println("Per Person Cost Before Tip: " + formattedCostPerPersonWithoutTip);
        System.out.println("Tip Per Person: " + formattedTipPerPerson);
        System.out.println("Total Cost Per Person: " + formattedTotalCostPerPerson);

    }

}
