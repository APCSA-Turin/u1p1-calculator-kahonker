package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW
        double tip = (percent/100.0) * cost;
        double costWithTip = cost + tip;
        double perPerson = cost/people;
        double tipPerPerson = tip/people;
        double totalCostPerPerson = costWithTip/people;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + (double)Math.round((tip) * 100)/100 + "\n" +
                       "Total Bill with tip: $" + (double)Math.round((costWithTip) * 100)/100 + "\n" +
                       "Per person cost before tip: $" + (double)Math.round((perPerson) * 100)/100 + "\n" +
                       "Tip per person: $" + (double)Math.round((tipPerPerson) * 100)/100 + "\n" +
                       "Total cost per person: $" + (double)Math.round((totalCostPerPerson) * 100)/100 + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner scanner = new Scanner(System.in);
        String menuItem = "";
        double tip = (percent/100.0) * cost;
        double costWithTip = cost + tip;
        double perPerson = cost/people;
        double tipPerPerson = tip/people;
        double totalCostPerPerson = costWithTip/people;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + (double)Math.round((tip) * 100)/100 + "\n" +
                       "Total Bill with tip: $" + (double)Math.round((costWithTip) * 100)/100 + "\n" +
                       "Per person cost before tip: $" + (double)Math.round((perPerson) * 100)/100 + "\n" +
                       "Tip per person: $" + (double)Math.round((tipPerPerson) * 100)/100 + "\n" +
                       "Total cost per person: $" + (double)Math.round((totalCostPerPerson) * 100)/100 + "\n" +
                       "-------------------------------\n";
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        result += "Items ordered:\n";

        while (!menuItem.equals("-1")) {
            System.out.println("Enter an item name or type \"-1\" to cancel");
            menuItem = scanner.nextLine();
            if (!menuItem.equals("-1")){
                result += menuItem + "\n";
            }
        }
        result+="-------------------------------\n";

        scanner.close();

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
