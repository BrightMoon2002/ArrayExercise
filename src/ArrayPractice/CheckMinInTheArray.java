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

        
    }
}
}
