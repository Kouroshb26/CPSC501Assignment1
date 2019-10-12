package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-11
 */
public class LengthConverterConvertTest extends IOTestUtil {
    LengthConverter lengthConverter = new LengthConverter();

    @Test
    public void convertInches() {
        provideInput("1\r\n");
        lengthConverter.convert(1);
        assertTrue(getOutput().contains("Enter the number of inches:"));
    }

    @Test
    public void convertFeet() {
        provideInput("1\r\n");
        lengthConverter.convert(2);
        assertTrue(getOutput().contains("Enter the number of feet:"));
    }


    @Test
    public void convertMiles() {
        provideInput("1\r\n");
        lengthConverter.convert(3);
        assertTrue(getOutput().contains("Enter the number of miles:"));
    }


    @Test
    public void convertCentimetres() {
        provideInput("1\r\n");
        lengthConverter.convert(4);
        assertTrue(getOutput().contains("Enter the number of centimetres:"));
    }


    @Test
    public void convertMetres() {
        provideInput("1\r\n");
        lengthConverter.convert(5);
        assertTrue(getOutput().contains("Enter the number of metres:"));
    }


    @Test
    public void convertKilometres() {
        provideInput("1\r\n");
        lengthConverter.convert(6);
        assertTrue(getOutput().contains("Enter the number of kilometres:"));
    }


    @Test
    public void convertInvalidChoice() {
        provideInput("1\r\n");
        lengthConverter.convert(0);
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }

}
