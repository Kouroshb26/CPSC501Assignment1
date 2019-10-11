package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-10
 */
public class LengthConverterTest {

    private LengthConverter lengthConverter = new LengthConverter();

    @Test
    public void inches_to_centimetres() {
        String output = lengthConverter.inches_to_centimetres(25F);
        assertEquals("63.5 centimetres", output);
    }

    @Test
    public void feet_to_meters() {
        String output = lengthConverter.feet_to_meters(25F);
        assertEquals("7.62 metres", output);
    }

    @Test
    public void miles_to_kilometres() {
        String output = lengthConverter.miles_to_kilometres(25F);
        assertEquals("40.2325 kilometres", output);
    }

    @Test
    public void centimetres_to_inches() {
        String output = lengthConverter.centimetres_to_inches(25F);
        assertEquals("9.84251968503937 inches", output);
    }

    @Test
    public void meters_to_feet() {
        String output = lengthConverter.meters_to_feet(25F);
        assertEquals("82.02099737532808 feet", output);
    }

    @Test
    public void kilometres_to_miles() {
        String output = lengthConverter.kilometres_to_miles(25F);
        assertEquals("15.534704529919841 miles", output);
    }
}
