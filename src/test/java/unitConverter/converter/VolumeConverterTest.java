package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kourosh
 * @since 2019-10-10
 */
public class VolumeConverterTest {
    private VolumeConverter volumeConverter = new VolumeConverter();

    @Test
    public void oz_to_mil() {
        String output = volumeConverter.oz_to_mil(10F);
        assertEquals("295.7 millilitres", output);
    }

    @Test
    public void gallons_to_litres() {
        String output = volumeConverter.gallons_to_litres(10F);
        assertEquals("37.85 litres", output);
    }

    @Test
    public void mil_to_oz() {
        String output = volumeConverter.mil_to_oz(10F);
        assertEquals("0.3381805884342239 fluid oz.", output);
    }

    @Test
    public void litres_to_gallons() {
        String output = volumeConverter.litres_to_gallons(10F);
        assertEquals("2.642007926023778 gallons", output);
    }
}
