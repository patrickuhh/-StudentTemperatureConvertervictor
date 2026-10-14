package com.student.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void convertsFreezingPointToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void convertsBoilingPointToFahrenheit() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void convertsWaterFreezingPointToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    void convertsWaterBoilingPointToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
    }
}
