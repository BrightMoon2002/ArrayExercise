package ArrayPractice;

import java.util.Scanner;

public class CalculatorMainDiagonalArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Creat a dimensional array and calculator the main diagonal of this array:");
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
        int total = 0;
        if (sizeRow < sizeColumn) {
            for (int i = 0; i < sizeRow; i++) {
                total += array[i][i];
            }
        } else {
            for (int i = 0; i < sizeColumn; i++) {
                total += array[i][i];
            }
        }
        System.out.printf("total main diagonal of this array is: %d", total);
    }
}
