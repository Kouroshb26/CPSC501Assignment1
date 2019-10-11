package unitConverter.converter;

import java.security.PublicKey;
import java.util.Scanner;

public class WeightConverter extends Converter {
    private static final String PURPOSE = "Convert weight units";

    public void convert() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert ounces to grams");
        System.out.println("2. Convert pounds to kilograms");
        System.out.println("3. Convert grams to ounces");
        System.out.println("4. Convert kilograms to pounds");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        float weight;
        String result;
        switch (choice) {
            case 1:
                System.out.println("Enter the number of ounces:");
                weight = menu.nextFloat();
                result = ounces_to_grams(weight);
                break;
            case 2:
                System.out.println("Enter the number of pounds:");
                weight = menu.nextFloat();
                result = pounds_to_kilograms(weight);
                break;
            case 3:
                System.out.println("Enter the number of grams:");
                weight = menu.nextFloat();
                result = grams_to_ounces(weight);
                break;
            case 4:
                System.out.println("Enter the number of kilograms:");
                weight = menu.nextFloat();
                result = kilograms_to_pounds(weight);
                break;
            default:
                System.out.println("Invalid choice, exiting");
                return;
        }
        System.out.println("The result is " + result);

    }

    @Override
    public String methodName() {
        return PURPOSE;
    }

    public String ounces_to_grams(float weight) {
        return weight * 28.35 + " grams";
    }

    public String pounds_to_kilograms(float weight) {
        return weight * 0.45359 + " kilograms";
    }

    public String grams_to_ounces(float weight) {
        return weight / 28.35 + " ounces";
    }

    public String kilograms_to_pounds(float weight) {
        return weight / 0.45359 + " pounds";
    }
}
