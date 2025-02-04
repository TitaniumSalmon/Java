import java.util.Scanner;
import java.util.Arrays;

public class MyNumeric {
    public static void main(String[] args) {
        double number[];
        number = new double[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < number.length ; i++){
            number[i] = input.nextDouble();
        }
        SimpleNumeric calculator = new SimpleNumeric();
        System.out.println("All numbers: " + Arrays.toString(number));
        System.out.println("Min: " + calculator.getMin(number));
        System.out.println("Max: " + calculator.getMax(number));
        System.out.println("Average: " + calculator.getAverage(number));
        System.out.println("Summary: " + calculator.getSummary(number));
    }
}
