package unitConverter.converter;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-11
 */
public class VolumeConverterConvertTest extends IOTestUtil {
    VolumeConverter volumeConverter = new VolumeConverter();

    @Test
    public void convertOz() {
        provideInput("1\r\n");
        volumeConverter.convert(1);
        assertTrue(getOutput().contains("Enter the number of fluid oz.:"));
    }

    @Test
    public void convertGallons() {
        provideInput("1\r\n");
        volumeConverter.convert(2);
        assertTrue(getOutput().contains("Enter the number of gallons:"));
    }

    @Test
    public void convertMillilitres() {
        provideInput("1\r\n");
        volumeConverter.convert(3);
        assertTrue(getOutput().contains("Enter the number of millilitres:"));
    }

    @Test
    public void convertLitres() {
        provideInput("1\r\n");
        volumeConverter.convert(4);
        assertTrue(getOutput().contains("Enter the number of litres:"));
    }

    @Test
    public void convertInvalid() {
        provideInput("1\r\n");
        volumeConverter.convert(0);
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }

}
