package unitConverter.converter;

public class TimeConverter extends Converter {
    private static final String PURPOSE = "Convert date/time units";

    public void convert(int choice) {
        String result;
        switch (choice) {
            case 1:
                System.out.println("Enter the date:");
                result = US_Time_To_CAD_Time(Input.nextLine());
                break;
            case 2:
                System.out.println("Enter the date:");
                result = US_Time_To_EURO_Time(Input.nextLine());
                break;
            case 3:
                System.out.println("Enter the date:");
                result = CAD_Time_To_US_Time(Input.nextLine());
                break;
            case 4:
                System.out.println("Enter the date:");
                result = CAD_Time_To_EURO_Time(Input.nextLine());
                break;
            case 5:
                System.out.println("Enter the date:");
                result = EURO_Time_To_US_Time(Input.nextLine());
                break;
            case 6:
                System.out.println("Enter the date:");
                result = EURO_Time_To_CAD_Time(Input.nextLine());
                break;
            case 7:
                System.out.println("Enter the date:");
                result = hour12ToHour24(Input.nextLine());
                break;
            case 8:
                System.out.println("Enter the date:");
                result = hour24ToHour12(Input.nextLine());
                break;
            default:
                System.out.println("Invalid choice, exiting");
                return;
        }
        System.out.println("The result is " + result);
    }

    @Override
    public void printMenu() {
        System.out.println(PURPOSE);
        System.out.println("Choose from the following:");
        System.out.println("1. Convert US date format to Canadian date format");
        System.out.println("2. Convert US date format to European date format");
        System.out.println("3. Convert Canadian date format to US date format");
        System.out.println("4. Convert Canadian date format to European date format");
        System.out.println("5. Convert European date format to US date format");
        System.out.println("6. Convert European date format to Canadian date format");
        System.out.println("7. Convert 12-hour format to 24-hour format");
        System.out.println("8. Convert 24-hour format to 12-hour format");
    }

    @Override
    public String methodName() {
        return PURPOSE;
    }

    public String US_Time_To_CAD_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[2] + "/" + splitString[0] + "/" + splitString[1];
    }

    public String US_Time_To_EURO_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[1] + "/" + splitString[0] + "/" + splitString[2];
    }

    public String CAD_Time_To_US_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[1] + "/" + splitString[2] + "/" + splitString[0];
    }

    public String CAD_Time_To_EURO_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[2] + "/" + splitString[1] + "/" + splitString[0];
    }

    public String EURO_Time_To_US_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[1] + "/" + splitString[0] + "/" + splitString[2];
    }

    public String EURO_Time_To_CAD_Time(String date) {
        String[] splitString = date.split("\\/|\\-|\\.");
        return splitString[2] + "/" + splitString[1] + "/" + splitString[0];
    }

    public String hour12ToHour24(String date) {

        String[] splitString = date.split(":| ");
        int hours12 = Integer.parseInt(splitString[0]);
        int minutes12 = Integer.parseInt(splitString[1]);
        if (splitString[2].equalsIgnoreCase("PM")) {
            hours12 += 12;
            if (hours12 == 24) {
                hours12 = 0;
            }
        }
        return hours12 + ":" + minutes12;
    }

    public String hour24ToHour12(String date) {
        String[] splitString = date.split(":");
        int hours24 = Integer.parseInt(splitString[0]);
        int minutes24 = Integer.parseInt(splitString[1]);
        String period;
        if (hours24 >= 12) {
            period = "PM";
            hours24 -= 12;
            if (hours24 == 0) {
                hours24 = 12;
            }
        } else {
            period = "AM";
            if (hours24 == 0) {
                hours24 = 12;
            }
        }

        return hours24 + ":" + minutes24 + " " + period;
    }
}
