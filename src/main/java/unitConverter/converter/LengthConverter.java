package unitConverter.converter;

import java.util.Scanner;

public class LengthConverter extends Converter {

    public void convert() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert inches to centimetres");
        System.out.println("2. Convert feet to meters");
        System.out.println("3. Convert miles to kilometres");
        System.out.println("4. Convert centimetres to inches");
        System.out.println("5. Convert meters to feet");
        System.out.println("6. Convert kilometres to miles");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        float length;
        String result;
        switch (choice) {
            case 1:
                System.out.println("Enter the number of inches:");
                length = menu.nextFloat();
                result = inches_to_centimetres(length);
                break;
            case 2:
                System.out.println("Enter the number of feet:");
                length = menu.nextFloat();
                result = feet_to_meters(length);
                break;
            case 3:
                System.out.println("Enter the number of miles:");
                length = menu.nextFloat();
                result = miles_to_kilometres(length);
                break;
            case 4:
                System.out.println("Enter the number of centimetres:");
                length = menu.nextFloat();
                result = centimetres_to_inches(length);
                break;
            case 5:
                System.out.println("Enter the number of metres:");
                length = menu.nextFloat();
                result = meters_to_feet(length);
                break;
            case 6:
                System.out.println("Enter the number of kilometres:");
                length = menu.nextFloat();
                result = kilometres_to_miles(length);
                break;
            default:
                System.out.println("Invalid choice, exiting");
                return;
        }
        System.out.println("The result is " + result);
    }


    public String inches_to_centimetres(Float length) {
        return length * 2.54 + " centimetres";
    }

    public String feet_to_meters(Float length) {
        return length * 0.3048 + " metres";

    }

    public String miles_to_kilometres(Float length) {
        return length * 1.6093 + " kilometres";

    }

    public String centimetres_to_inches(Float length) {
        return length / 2.54 + " inches";

    }

    public String meters_to_feet(Float length) {
        return length / 0.3048 + " feet";

    }

    public String kilometres_to_miles(Float length) {
        return length / 1.6093 + " miles";
    }

}
