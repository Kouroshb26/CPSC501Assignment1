package unitConverter.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kourosh
 * @since 2019-10-10
 */
public class TimeConverterTest {

    private TimeConverter timeConverter = new TimeConverter();


    @Test
    public void US_Time_To_CAD_Time() {
        String output = timeConverter.US_Time_To_CAD_Time("07/17/1996");
        assertEquals("1996/07/17", output);
    }

    @Test
    public void US_Time_To_EURO_Time() {
        String output = timeConverter.US_Time_To_EURO_Time("07/17/1996");
        assertEquals("17/07/1996", output);
    }

    @Test
    public void CAD_Time_To_US_Time() {
        String output = timeConverter.CAD_Time_To_US_Time("1996/07/17");
        assertEquals("07/17/1996", output);
    }

    @Test
    public void CAD_Time_To_EURO_Time() {
        String output = timeConverter.CAD_Time_To_EURO_Time("1996/07/17");
        assertEquals("17/07/1996", output);
    }

    @Test
    public void EURO_Time_To_US_Time() {
        String output = timeConverter.EURO_Time_To_US_Time("17/07/1996");
        assertEquals("07/17/1996", output);
    }

    @Test
    public void EURO_Time_To_CAD_Time() {
        String output = timeConverter.EURO_Time_To_CAD_Time("17/07/1996");
        assertEquals("1996/07/17", output);
    }

    @Test
    public void hour12ToHour24() {
        String output = timeConverter.hour12ToHour24("2:55 PM");
        assertEquals("14:55", output);
    }

    @Test
    public void hour24ToHour12() {
        String output = timeConverter.hour24ToHour12("14:55");
        assertEquals("2:55 PM", output);
    }


}
