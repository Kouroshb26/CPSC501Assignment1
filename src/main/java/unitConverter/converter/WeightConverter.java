package unitConverter.converter;

public class WeightConverter extends Converter {
    private static final String PURPOSE = "Convert weight units";

    @Override
    public void printMenu() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert ounces to grams");
        System.out.println("2. Convert pounds to kilograms");
        System.out.println("3. Convert grams to ounces");
        System.out.println("4. Convert kilograms to pounds");
    }

    public void convert(int choice) {
        float weight;
        String result;
        switch (choice) {
            case 1:
                System.out.println("Enter the number of ounces:");
                weight = Input.nextFloat();
                result = ounces_to_grams(weight);
                break;
            case 2:
                System.out.println("Enter the number of pounds:");
                weight = Input.nextFloat();
                result = pounds_to_kilograms(weight);
                break;
            case 3:
                System.out.println("Enter the number of grams:");
                weight = Input.nextFloat();
                result = grams_to_ounces(weight);
                break;
            case 4:
                System.out.println("Enter the number of kilograms:");
                weight = Input.nextFloat();
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
