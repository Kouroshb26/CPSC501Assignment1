package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-10
 */
public class WeightConverterTest {

    private WeightConverter weightConverter = new WeightConverter();

    @Test
    public void ounces_to_grams() {
        String output = weightConverter.ounces_to_grams(10F);
        assertEquals("283.5 grams", output);
    }

    @Test
    public void pounds_to_kilograms() {
        String output = weightConverter.pounds_to_kilograms(10F);
        assertEquals("4.5359 kilograms", output);

    }

    @Test
    public void grams_to_ounces() {
        String output = weightConverter.grams_to_ounces(10F);
        assertEquals("0.3527336860670194 ounces", output);
    }

    @Test
    public void kilograms_to_pounds() {
        String output = weightConverter.kilograms_to_pounds(10F);
        assertEquals("22.04634140964307 pounds", output);
    }
}
