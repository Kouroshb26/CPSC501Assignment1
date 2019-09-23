package unitConverter;

import java.util.Scanner;

public class LengthConverter extends Converter {

	public void convert() {
		System.out.println("Choose from the following:");
		System.out.println("1. Convert inches to centimetres");
		System.out.println("2. Convert feet to metres");
		System.out.println("3. Convert miles to kilometres");
		System.out.println("4. Convert centimetres to inches");
		System.out.println("5. Convert metres to feet");
		System.out.println("6. Convert kilometres to miles");
		Scanner menu = new Scanner(System.in);
		int choice = menu.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the number of inches:");
			float iLength = menu.nextFloat();
			System.out.println("The result is "+ iLength*2.54 + " centimetres");
			break;
		case 2:
			System.out.println("Enter the number of feet:");
			float fLength = menu.nextFloat();
			System.out.println("The result is "+ fLength*0.3048 + " metres");
			break;
		case 3:
			System.out.println("Enter the number of miles:");
			float miLength = menu.nextFloat();
			System.out.println("The result is "+ miLength*1.6093 + " kilometres");
			break;
		case 4:
			System.out.println("Enter the number of centimetres:");
			float cLength = menu.nextFloat();
			System.out.println("The result is "+ cLength/2.54 + " inches");
			break;
		case 5:
			System.out.println("Enter the number of metres:");
			float mLength = menu.nextFloat();
			System.out.println("The result is "+ mLength/0.3048 + " feet");
			break;
		case 6:
			System.out.println("Enter the number of kilometres:");
			float kLength = menu.nextFloat();
			System.out.println("The result is "+ kLength/1.6093 + " miles");
			break;
		default:
			System.out.println("Invalid choice, exiting");
			break;
		}
		
	}
}
