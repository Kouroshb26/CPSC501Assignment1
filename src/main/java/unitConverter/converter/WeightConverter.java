package unitConverter.converter;

import java.util.Scanner;

public class WeightConverter extends Converter {

    public void convert() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert ounces to grams");
        System.out.println("2. Convert pounds to kilograms");
        System.out.println("3. Convert grams to ounces");
        System.out.println("4. Convert kilograms to pounds");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number of ounces:");
                float oWeight = menu.nextFloat();
                System.out.println("The result is " + oWeight * 28.35 + " grams");
                break;
            case 2:
                System.out.println("Enter the number of pounds:");
                float pWeight = menu.nextFloat();
                System.out.println("The result is " + pWeight * 0.45359 + " kilograms");
                break;
            case 3:
                System.out.println("Enter the number of grams:");
                float gWeight = menu.nextFloat();
                System.out.println("The result is " + gWeight / 28.35 + " ounces");
                break;
            case 4:
                System.out.println("Enter the number of kilograms:");
                float kWeight = menu.nextFloat();
                System.out.println("The result is " + kWeight / 0.45359 + " pounds");
                break;
            default:
                System.out.println("Invalid choice, exiting");
                break;
        }
    }
}
