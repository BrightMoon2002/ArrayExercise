package ArrayPractice;

import java.util.Scanner;

public class CombineTwoArrays {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Combine the element in 2 Arrays, Enter 2 arrays and combine them:");
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int size1;
        int size2;

        size1 = inputSizeArray();
        array1 = new int[size1]
        for (int i = 0; i < array1.length; i++) {
            
        }
        size2 = inputSizeArray();
    }

    private static int inputSizeArray() {
        int size;
        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the size:");
            size = inputSize.nextInt();
            if (size <= 0) {
                System.out.println("The size is not less 0");
            }
            return size;
        } while (size <= 0);
    }
}

