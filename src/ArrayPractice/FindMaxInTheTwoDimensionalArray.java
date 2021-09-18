package ArrayPractice;

import java.util.Scanner;

public class FindMaxInTheTwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Enter they two dimensional A");

        int[][] array;
        int rowSize;
        int columnSize;

        do {
            Scanner inputRowSize = new Scanner(System.in);
            System.out.println("Enter the row size:");
            rowSize = inputRowSize.nextInt();
            Scanner inputColumnSize = new Scanner(System.in);
            System.out.println("Enter the column size");
            columnSize = inputColumnSize.nextInt();
            if (rowSize <= 0 || columnSize <= 0) {
                System.out.println("The size of the Array is greater than 0");
            }
        } while (rowSize <= 0 || columnSize <= 0);

        array = new int[rowSize][columnSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Scanner inputNumber = new Scanner(System.in);
                System.out.println("Enter the number in index:" + i + ", " + j);
                int num = inputNumber.nextInt();
                array[i][j] = num;
            }
        }


        int max = array[0][0];
        System.out.println("The Max in the array is: " + checkMax(array, max));
    }

    private static int checkMax(int[][] array, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
