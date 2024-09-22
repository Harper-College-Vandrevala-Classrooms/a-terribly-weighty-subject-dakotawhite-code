package com.csc;

public class Converter {

    // Overloaded methods Portfolio add on
    public String toPounds() {
        return toPounds(0);
    }

    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        // Format output with 4 decimal places
        String formatPounds = String.format("%.4f", pounds);
        // Determine right unit for pounds
        if (pounds == 1) {
            return formatPounds + " lb";
        } else {
            return formatPounds + " lbs";
        }
    }

    // Overloaded methods Portfolio add on
    public String toPoundsAndOunces() {
        return toPoundsAndOunces(0);
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int additionalOunces = ounces % 16;

        // Format pounds with 4 decimal places
        String formatPounds = String.format("%.4f", pounds + additionalOunces / 16.0);

        // Determine unit for pounds
        String lbPart = (pounds == 1) ? "1 lb" : pounds + " lbs";

        // Determine unit for ounces
        String ozPart = (additionalOunces == 1) ? "1 oz" : additionalOunces + " oz";

        // Construct output string
        if (pounds == 0 && additionalOunces == 0) {
            return "0 lbs 0 oz";  // Ensure zero output format matches expected
        } else if (pounds == 0) {
            return "0 lbs " + ozPart;  // Only ounces
        } else if (additionalOunces == 0) {
            return lbPart + " 0 oz";  // Only pounds
        } else {
            return lbPart + " " + ozPart;  // Both pounds and ounces
        }
    }

    // Convert the other way portfolio add on
    public String toOunces(int pounds, int ounces) {
        int poundsToOunces = pounds * 16;
        return (poundsToOunces + ounces) + " ounces";
      }

    // Display results for 0, 16, 18, and 36 ounces
    public static void main(String[] args) {
        Converter converter = new Converter();

        // Display conversions of 0, 16, 18, and 36 oz
        System.out.println("Convert 0 ounces:");
        System.out.println("To Pounds: " + converter.toPounds());
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces());

        System.out.println("\nConvert 16 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(16));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(16));

        System.out.println("\nConvert 18 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(18));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(18));

        System.out.println("\nConvert 36 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(36));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(36));
        
     // Overloaded methods Portfolio add on, test cases for no arguments
        System.out.println("\nDefault:");
        System.out.println("To Pounds: " + converter.toPounds());
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces());

        //Covert the other way porfolio add on
        System.out.println("\nConvert 0 pounds and 12 ounces:");
        System.out.println("To Ounces: " + converter.toOunces(0, 12));
        System.out.println("\nConvert 1 pounds and 15 ounces:");
        System.out.println("To Ounces: " + converter.toOunces(1,15));
    }
}
