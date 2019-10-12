package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-11
 */
public class ConverterTest extends IOTestUtil {

    @Test
    public void chooseConverterLength() {
        provideInput("1\r\n1\r\n");
        Converter.chooseConverter(1);
        assertTrue(getOutput().contains("Convert length units"));
        assertTrue(getOutput().contains("The result is 2.54 centimetres"));
    }

    @Test
    public void chooseConverterWeight() {
        provideInput("1\r\n1\r\n");
        Converter.chooseConverter(2);
        assertTrue(getOutput().contains("Convert weight units"));
        assertTrue(getOutput().contains("The result is 28.35 grams"));
    }

    @Test
    public void chooseConverterVolume() {
        provideInput("1\r\n1\r\n");
        Converter.chooseConverter(3);
        assertTrue(getOutput().contains("Convert volume units"));
        assertTrue(getOutput().contains("The result is 29.57 millilitres"));
    }

    @Test
    public void chooseConverterDate() {
        provideInput("1\r\n1\r\n");
        Converter.chooseConverter(4);
        assertTrue(getOutput().contains("Convert date/time units"));
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }

    @Test
    public void chooseConverterOutOfBoundsTooLow() {
        provideInput("");
        Converter.chooseConverter(0);
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }

    @Test
    public void chooseConverterOutOfBoundsTooHigh() {
        provideInput("");
        Converter.chooseConverter(100);
        assertTrue(getOutput().contains("Invalid choice, exiting"));
    }


}
