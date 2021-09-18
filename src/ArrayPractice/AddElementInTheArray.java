package ArrayPractice;

import java.util.Scanner;

public class AddElementInTheArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Add a number in the array, Enter the number and this index you want to add:");
        int[] array;
        int size;
        do {
            System.out.println("Enter the size of array:");
            Scanner inputSize = new Scanner(System.in);
            size = inputSize.nextInt();
            if (size <= 0) {
                System.out.println("The size doesnt exceed less 0");
            }
        } while (size <= 0);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner inputToArray = new Scanner(System.in);
            System.out.println("Enter the number in the index" + (i + 1));
            int num = inputToArray.nextInt();
            array[i] = num;
        }
        int[] newArray = new int[size + 1];
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = inputNumber.nextInt();
        Scanner inputIndex = new Scanner(System.in);
        System.out.println("Enter the index:");
        int index = inputIndex.nextInt();
        index = checkInt(0, array.length);

        int i, c;
        for (c = i = 0; i < newArray.length; i++) {
            if (index != i) {
                newArray[i] = array[c];
                c++;
            } else {
                newArray[i] = number;
            }
        }

        for (int k = 0; k < size + 1; k++) {
            System.out.print(newArray[k] + "\t");
        }
    }

    public static int checkInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input a integer in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}