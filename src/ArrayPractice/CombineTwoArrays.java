package ArrayPractice;

import java.util.Scanner;

public class CombineTwoArrays {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Combine the element in 2 Arrays, Enter 2 arrays and combine them:");

        int[] array1;
        int[] array2;
        int size1;
        int size2;
        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the size:");
            size1 = inputSize.nextInt();
            if (size1 <= 0) {
                System.out.println("The size is not less 0");
            }
        } while (size1 <= 0);
        array1 = new int[size1];
        creatArray(array1);

        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the size:");
            size2 = inputSize.nextInt();
            if (size2 <= 0) {
                System.out.println("The size is not less 0");
            }
        } while (size2 <= 0);
        array2 = new int[size2];
        creatArray(array2);

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < array3.length; i++) {
            if (i <= array1.length-1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }

    public static void creatArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            Scanner inputNumber2 = new Scanner(System.in);
            System.out.println("Enter the number at the index: " + (i + 1) + "in the Array 1: ");
            int num2 = inputNumber2.nextInt();
            array2[i] = num2;
        }
    }

}

