package it.utils.converter;

public interface TemperatureConverter {
    double celciusToFahrenheit(double celsius);
    double celciusToKelvin(double celsius);
    double fahrenheitToCelsius(double fahrenheit);
    double fahrenheitToKelvin(double fahrenheit);
    double kelvinToCelsius(double kelvin);
    double kelvinToFahrenheit(double kelvin);
}
