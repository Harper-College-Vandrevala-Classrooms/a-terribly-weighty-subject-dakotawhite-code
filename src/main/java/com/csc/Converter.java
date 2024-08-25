package com.csc;

public class Converter {

    // Converts ounces to pounds
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

    // Converts ounces to pounds and ounces
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        // Format output of decimal lbs to oz
        int additionaloz = ounces % 16;
        // Determine unit for pounds
        String lbpart;
        if (pounds == 1) {
            lbpart = "1 lb";
        } else {
            lbpart = pounds + " lbs";
        }
        // Determine unit for ounces
        String ozpart;
        if (additionaloz == 1) {
            ozpart = "1 ounce";
        } else {
            ozpart = additionaloz + " ounces";
        }
        // Construct output string
        return lbpart + " " + ozpart;  // Display pounds and ounces
    }

    // Display results for 0, 16, 18, and 36 ounces
    public static void main(String[] args) {
        Converter converter = new Converter();

        // Display conversions of 0,16,18, and 36 oz
        System.out.println("Convert 0 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(0));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(0));

        System.out.println("\nConvert 16 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(16));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(16));

        System.out.println("\nConvert 18 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(18));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(18));

        System.out.println("\nConvert 36 ounces:");
        System.out.println("To Pounds: " + converter.toPounds(36));
        System.out.println("To Pounds and Ounces: " + converter.toPoundsAndOunces(36));
    }
}
