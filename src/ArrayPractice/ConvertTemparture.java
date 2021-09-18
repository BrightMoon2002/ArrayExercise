package ArrayPractice;

import java.util.Scanner;

public class ConvertTemparture {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Convert the Temperature from C to F or vice versa, Enter the type of Temperature(C or F)");
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Convert C into F");
            System.out.println("2. Convert F into C");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Scanner tempC = new Scanner(System.in);
                    System.out.println("Enter the Temperature C:");
                    c = tempC.nextDouble();
                    System.out.println("The Temperature is: " + convertToF(c) + " F");
                    break;
                case 2:
                    Scanner tempF = new Scanner(System.in);
                    System.out.println("Enter the Temperature F:");
                    f = tempF.nextDouble();
                    System.out.println("The Temperature is: " + convertToC(f) + " C");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double convertToC(double temp) {
        double result;
        result = (5.0 / 9) * (temp - 32);
        return result;
    }

    public static double convertToF(double temp) {
        double result;
        result = 1.8 * temp + 32;
        return result;
    }
}
