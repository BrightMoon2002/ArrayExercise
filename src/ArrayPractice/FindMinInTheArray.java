package ArrayPractice;

import java.util.Scanner;

public class FindMinInTheArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Find Min in the arrays, you can make a arrays and find mid in this array");
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = creatArray(scanner);
        System.out.println("Min in the array is: " + findMin(array));
    }

    public static int[] creatArray(Scanner scanner) {
        int[] array;
        int size;
        do {
            System.out.println("Enter the size of array:");
            size = scanner.nextInt();
            if (size > 100) {
                System.out.println("Size doesnt exceed 100");
            }
        } while (size > 100);
        array = new int[size];
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println("Enter the element" + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        int j = 0;

        while (j < array.length) {
            if (array[j] < min) {
                min = array[j];
            }
            j++;
        }
        return min;
    }
}
