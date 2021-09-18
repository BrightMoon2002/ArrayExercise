package ArrayPractice;

import java.util.Scanner;

public class CalculatorInColumnArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Creat a dimensional array and calculator in the column of this array");

        int[][] array;
        int sizeRow;
        int sizeColumn;

        do {
            Scanner inputSizeRow = new Scanner(System.in);
            System.out.println("Enter the Array size Row:");
            sizeRow = inputSizeRow.nextInt();
            Scanner inputSizeColumn = new Scanner(System.in);
            System.out.println("Enter the Array size Column:");
            sizeColumn = inputSizeColumn.nextInt();
            if (sizeRow <= 0 || sizeColumn <= 0) {
                System.out.println("The size does not exceed");
            }
        } while (sizeRow <= 0 || sizeColumn <= 0);

        array = new int[sizeRow][sizeColumn];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Scanner inputNumber = new Scanner(System.in);
                System.out.println("Enter the number in the index:" + i + ", " + j);
                array[i][j] = inputNumber.nextInt();
            }
        }
        Scanner inputIndexColumn = new Scanner(System.in);
        System.out.println("Enter the index of Column which you want to calculator:");
        int indexColumn = inputIndexColumn.nextInt();

        int total = getTotal(array, indexColumn);
        System.out.printf("Total of element in column %d is %d", indexColumn, total);
    }

    private static int getTotal(int[][] array, int indexColumn) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][indexColumn];
        }
        return total;
    }
}
