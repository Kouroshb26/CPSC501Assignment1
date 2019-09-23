package unitConverter;

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
		switch (choice) {
		case 1:
			System.out.println("Enter the number of fluid oz.:");
			float oVolume = menu.nextFloat();
			System.out.println("The result is "+ oVolume*29.57 + " millilitres");
			break;
		case 2:
			System.out.println("Enter the number of gallons:");
			float gVolume = menu.nextFloat();
			System.out.println("The result is "+ gVolume*3.785 + " litres");
			break;
		case 3:
			System.out.println("Enter the number of millilitres:");
			float mVolume = menu.nextFloat();
			System.out.println("The result is "+ mVolume/29.57 + " fluid oz.");
			break;
		case 4:
			System.out.println("Enter the number of litres:");
			float lVolume = menu.nextFloat();
			System.out.println("The result is "+ lVolume/3.785 + " gallons");
			break;
		default:
			System.out.println("Invalid choice, exiting");
			break;
		}
	}
}
