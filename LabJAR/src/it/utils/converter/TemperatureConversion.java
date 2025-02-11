package it.utils.converter;

public class TemperatureConversion implements TemperatureConverter{

    @Override
    public double celciusToFahrenheit(double celsius){
        return (celsius*1.8)+32;
    }
    public double celciusToKelvin(double celsius){
        return celsius + 273.25;
    }
    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit-32)*5)/9;
    }
    public double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit - 459.67) * 5.0/9.0;
    }
    public double kelvinToCelsius(double kelvin){
        return kelvin - 273.25;
    }
    public double kelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 1.8 + 32;
    }
}
