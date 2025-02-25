package it.utils.converter;

public class TemperatureConversion implements TemperatureConverter{

    @Override
    public double celciusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public double celciusToKelvin(double celsius){
        return celsius + 273.15;  // Corrected from 273.25 to 273.15
    }

    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit - 32) * 5) / 9;
    }

    public double fahrenheitToKelvin(double fahrenheit){
        return ((fahrenheit - 32) * 5.0 / 9.0) + 273.15;  // Corrected to include the conversion to Kelvin
    }

    public double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;  // Corrected from 273.25 to 273.15
    }

    public double kelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 1.8 + 32;  // Corrected to use 273.15 instead of 273.25
    }
}
