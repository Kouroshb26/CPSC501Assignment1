package unitConverter.converter;

import java.util.Scanner;

public abstract class Converter {

    public static void main(String[] args) {
        Converter.listConverters();

        Scanner menu = new Scanner(System.in);
        Converter.chooseConverter(menu.nextInt());

    }

    public abstract void convert();

    private static void listConverters() {
        System.out.println("Welcome to the unit converter, please choose from the following options:");
        System.out.println("1. Convert length units");
        System.out.println("2. Convert weight units");
        System.out.println("3. Convert volume units");
        System.out.println("4. Convert date/time formats");
    }

    private static void chooseConverter(int choice) {
        switch (choice) {
            case 1:
                LengthConverter lConverter = new LengthConverter();
                lConverter.convert();
                break;
            case 2:
                WeightConverter wConverter = new WeightConverter();
                wConverter.convert();
                break;
            case 3:
                VolumeConverter vConverter = new VolumeConverter();
                vConverter.convert();
                break;
            case 4:
                TimeConverter tConverter = new TimeConverter();
                tConverter.convert();
                break;
            default:
                System.out.println("Invalid choice, exiting");
                break;

        }
    }



}
