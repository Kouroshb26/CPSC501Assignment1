package unitConverter.converter;

import java.util.Scanner;

public class TimeConverter extends Converter {

    public void convert() {
        System.out.println("Choose from the following:");
        System.out.println("1. Convert US date format to Canadian date format");
        System.out.println("2. Convert US date format to European date format");
        System.out.println("3. Convert Canadian date format to US date format");
        System.out.println("4. Convert Canadian date format to European date format");
        System.out.println("5. Convert European date format to US date format");
        System.out.println("6. Convert European date format to Canadian date format");
        System.out.println("7. Convert 12-hour format to 24-hour format");
        System.out.println("8. Convert 24-hour format to 12-hour format");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        String date1;
        String time1;
        String[] splitString;
        switch (choice) {
            case 1:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[2] + "/" + splitString[0] + "/" + splitString[1]);
                break;
            case 2:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[1] + "/" + splitString[0] + "/" + splitString[2]);
                break;
            case 3:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[1] + "/" + splitString[2] + "/" + splitString[0]);
                break;
            case 4:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[2] + "/" + splitString[1] + "/" + splitString[0]);
                break;
            case 5:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[1] + "/" + splitString[0] + "/" + splitString[2]);
                break;
            case 6:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split("\\/|\\-|\\.");
                System.out.println("The result is " + splitString[2] + "/" + splitString[1] + "/" + splitString[0]);
                break;
            case 7:
                System.out.println("Enter the date:");
                menu.nextLine();
                time1 = menu.nextLine();
                splitString = time1.split(":| ");
                int hours12 = Integer.parseInt(splitString[0]);
                int minutes12 = Integer.parseInt(splitString[1]);
                if (splitString[2].equalsIgnoreCase("PM")) {
                    hours12 += 12;
                    if (hours12 == 24) {
                        hours12 = 0;
                    }
                }
                System.out.println("The result is " + hours12 + ":" + minutes12);
                break;
            case 8:
                System.out.println("Enter the date:");
                menu.nextLine();
                date1 = menu.nextLine();
                splitString = date1.split(":");
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


                System.out.println("The result is " + hours24 + ":" + minutes24 + " " + period);
                break;
        }
    }

}
