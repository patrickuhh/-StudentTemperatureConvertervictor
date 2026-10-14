package com.student.temperature;

public class TemperatureApp {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.printf("25 Celsius = %.2f Fahrenheit%n",
                converter.celsiusToFahrenheit(25));
        System.out.printf("77 Fahrenheit = %.2f Celsius%n",
                converter.fahrenheitToCelsius(77));
    }
}
