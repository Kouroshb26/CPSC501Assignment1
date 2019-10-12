package unitConverter.converter;

import java.util.Scanner;

/**
 * @author kourosh
 * @since 2019-10-10
 */
public class Input {

    public static Scanner menu = new Scanner(System.in);

    public static int nextInt() {
        int integer = menu.nextInt();
        menu.nextLine();
        return integer;
    }

    public static float nextFloat() {
        float floatNumber = menu.nextFloat();
        menu.nextLine();
        return floatNumber;

    }

    public static String nextLine() {
        return menu.nextLine();
    }


}
