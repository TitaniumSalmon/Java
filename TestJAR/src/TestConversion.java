import it.utils.converter.*;

import java.util.Scanner;

public class TestConversion {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("= 1.CelciusToFahrenheit =");
        System.out.println("= 2.CelciusToKelvin     =");
        System.out.println("= 3.FahrenheitToCelsius =");
        System.out.println("= 4.FahrenheitToKelvin  =");
        System.out.println("= 5.KelvinToCelsius     =");
        System.out.println("= 6.KelvinToFahrenheit  =");
        System.out.println("=========================");
        System.out.println();
        System.out.print("Enter number 1 - 6: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.print("Enter temp: ");
        double temp = scanner.nextDouble();
        TemperatureConversion con = new TemperatureConversion();

        switch (choice){
            case 1:
                System.out.println("CelciusToFahrenheit: " + con.celciusToFahrenheit(temp));
                break;
            case 2:
                System.out.println("CelciusToKelvin: " + con.celciusToKelvin(temp));
                break;
            case 3:
                System.out.println("FahrenheitToCelsius: " + con.fahrenheitToCelsius(temp));
                break;
            case 4:
                System.out.println("FahrenheitToKelvin: " + con.fahrenheitToKelvin(temp));
                break;
            case 5:
                System.out.println("KelvinToCelsius: " + con.kelvinToCelsius(temp));
                break;
            case 6:
                System.out.println("KelvinToFahrenheit: " + con.kelvinToFahrenheit(temp));
                break;
            default:
                System.out.println("Please enter number 1-6 only");
        }
    }
}
