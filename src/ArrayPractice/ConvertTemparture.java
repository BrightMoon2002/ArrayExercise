package ArrayPractice;

import java.util.Scanner;

public class ConvertTemparture {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Convert the Temperature from C to F or vice versa, Enter the type of Temperature(C or F)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of Temperature: ");
        String typeTemperature = scanner.nextLine();
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter the Temperature:");
        double temp = temperature.nextDouble();
        if (typeTemperature.equals("C")) {
            System.out.println("The Temperature is: %dF" + convertToF(temp) + " F");
        } else if (typeTemperature.equals("F")) {
            System.out.println("The Temperature is: %dC" + convertToC(temp) + " C");
        } else {
            System.out.println("Type of Temperature does not exceed");
        }
    }

    public static double convertToC(double temp) {
        double result;
        result = (5.0 / 9) * (temp -32);
        return result;
    }

    public static double convertToF(double temp) {
        double result;
        result = 1.8 * temp + 32;
        return result;
    }
}
