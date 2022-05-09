import static org.testng.Assert.*;

public class TemperatureConverterTest {

    @org.testng.annotations.Test
    public void testMain() {
    }

    @org.testng.annotations.Test
    public void testToCelsius() {
        assertEquals(TemperatureConverter.toCelsius(32),0);
    }

    @org.testng.annotations.Test
    public void testToFahrenheit() {
        assertEquals(TemperatureConverter.toFahrenheit(0),32);
    }
}