package unitConverter.converter;

import java.util.Scanner;

public class VolumeConverter extends Converter {

    public void convert() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert fluid oz. to millilitres");
        System.out.println("2. Convert gallons to litres");
        System.out.println("3. Convert millilitres to fluid oz.");
        System.out.println("4. Convert litres to gallons");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        String result;
        float volume;
        switch (choice) {
            case 1:
                System.out.println("Enter the number of fluid oz.:");
                volume = menu.nextFloat();
                result = oz_to_mil(volume);
                break;
            case 2:
                System.out.println("Enter the number of gallons:");
                volume = menu.nextFloat();
                result = gallons_to_litres(volume);
                break;
            case 3:
                System.out.println("Enter the number of millilitres:");
                volume = menu.nextFloat();
                result = mil_to_oz(volume);
                break;
            case 4:
                System.out.println("Enter the number of litres:");
                volume = menu.nextFloat();
                result = litres_to_gallons(volume);
                break;
            default:
                System.out.println("Invalid choice, exiting");
                return;
        }
        System.out.println("The result is " + result);
    }

    public String oz_to_mil(Float volume) {
        return volume * 29.57 + " millilitres";
    }

    public String gallons_to_litres(Float volume) {
        return volume * 3.785 + " litres";
    }

    public String mil_to_oz(Float volume) {
        return volume / 29.57 + " fluid oz.";
    }

    public String litres_to_gallons(Float volume) {
        return volume / 3.785 + " gallons";
    }
}
