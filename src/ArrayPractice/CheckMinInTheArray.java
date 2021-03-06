package ArrayPractice;

import java.util.Scanner;

public class CheckMinInTheArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Check the Min number in the Array. Creat the Array and check Min");
        int[] array;
        int size;

        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            size = inputSize.nextInt();
            if (size <= 0) {
                System.out.println("The Array size is greater than 0");
            }
        } while (size <= 0);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Scanner inputNumber = new Scanner(System.in);
            System.out.println("Enter the number in the index" + i);
            array[i] = inputNumber.nextInt();
        }
        System.out.printf("%d is the Min of the Array", checkMin(array));
    }

    private static int checkMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

