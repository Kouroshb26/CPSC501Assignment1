package unitConverter.converter;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author kourosh
 * @since 2019-10-11
 */
public class WeightConverterConvertTest extends IOTestUtil {

    WeightConverter weightConverter = new WeightConverter();

    @Test
    public void convertOunce() {
        provideInput("1\r\n");
        weightConverter.convert(1);
        assertTrue(getOutput().contains("Enter the number of ounces:"));
    }

    @Test
    public void convertPounds() {
        provideInput("1\r\n");
        weightConverter.convert(2);
        assertTrue(getOutput().contains("Enter the number of pounds:"));
    }

    @Test
    public void convertGrams() {
        provideInput("1\r\n");
        weightConverter.convert(3);
        assertTrue(getOutput().contains("Enter the number of grams:"));
    }

    @Test
    public void convertKillogram() {
        provideInput("1\r\n");
        weightConverter.convert(4);
        assertTrue(getOutput().contains("Enter the number of kilograms:"));
    }

    @Test
    public void convertInvalid() {
        provideInput("1\r\n");
        weightConverter.convert(0);
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }

}
