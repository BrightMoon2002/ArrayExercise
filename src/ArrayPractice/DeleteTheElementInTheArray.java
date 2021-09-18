package ArrayPractice;

import java.util.Scanner;

public class DeleteTheElementInTheArray {
    public static void main(String[] args) {
        System.out.println("Author is NGUYEN HOANG DUY - C0821H1");
        System.out.println("Delete 1 element in the array. First check the Element if it in the array, app delete it, if not will notice element in not in the array");
        Scanner inputNumber = new Scanner(System.in);
       int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number which you want to check:");
        int num = inputNumber.nextInt();
        checkIndex(array, num);
        if (checkIndex(array, num) == -1) {
            System.out.printf("Number %d is not in the array", num);
        } else {
            array = deleteArray(array, num);
            for (int i = 0; i <array.length; i++) {
                System.out.print(array[i] + "\t");
            }
            }
        }



    public static int checkIndex(int[] array, int num) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static int[] deleteArray(int[] array, int num) {
        for (int j = checkIndex(array, num); j < array.length; j++) {
            if (j < array.length -1) {
                array[j] = array[j+1];
            } else {
                array[j] = 0;
            }
        }
        return array;
    }
}
