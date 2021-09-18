package ArrayPractice;

import java.util.Scanner;

public class CalculatorInColumnArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Creat a dimensional array and calculator in the column of this array");

        int[] array;
        int size;

        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the Array size:");
            size = inputSize.nextInt();
            if (size <= 0) {
                System.out.println("The size does not exceed");
            }
        } while (size <= 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Scanner inputNumber = new Scanner(System.in);
            array[i] = inputNumber.nextInt();
        }
    }
}
