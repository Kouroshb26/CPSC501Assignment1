package unitConverter.converter;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Converter {

    private static ArrayList<Converter> converters = new ArrayList<>(Arrays.asList(
        new LengthConverter(),
        new WeightConverter(),
        new VolumeConverter(),
        new TimeConverter()));

    public static void main(String[] args) {
        Converter.listConverters();

        Converter.chooseConverter(Input.nextInt());

    }

    public abstract void printMenu();

    public abstract void convert(int choice);

    public abstract String methodName();

    private static void listConverters() {
        System.out.println("Welcome to the unit converter, please choose from the following options:");

        int index = 1;
        for (Converter converter : converters) {
            System.out.println(index++ + ". " + converter.methodName());
        }
    }

    static void chooseConverter(int choice) {
        try {
            Converter converter = converters.get(choice - 1);
            converter.printMenu();
            converter.convert(Input.nextInt());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid choice, exiting");
        }
    }


}
