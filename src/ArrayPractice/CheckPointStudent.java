package ArrayPractice;

import java.util.Scanner;

public class CheckPointStudent {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Creat array have point of student. if point > 5, student pass the Exam. Check How many Students pass the Exam");
        int[] array;
        int size;

        do {
            Scanner inputSize = new Scanner(System.in);
            System.out.println("Enter the array size:");
            size = inputSize.nextInt();
            if (size > 30 || size <= 0) {
                System.out.println("the size does not exceed:");
            }
        } while (size > 30 || size <= 0);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Scanner point = new Scanner(System.in);
            System.out.println("Enter the point of the student " + i);
            array[i] = point.nextInt();
        }

        System.out.printf("There are %d Students who pass the exam", checkCount(array));

    }

    private static int checkCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}
