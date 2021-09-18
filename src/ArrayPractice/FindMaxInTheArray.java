package ArrayPractice;

import java.util.Scanner;

public class FindMaxInTheArray {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Check Max in the Array, \n" +
                "you can enter the net worth of 20 billionaires in the world, and we can check max of them: ");
        Scanner scanner = new Scanner(System.in);
        int[] netWorth;
        int size;
        do {
            System.out.println("Enter the size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size doesnt exceed 20");
            }
        } while (size > 20);
        netWorth = new int[size];
        int i = 0;
        while (i < netWorth.length) {
            System.out.println("Enter the element: " + (i + 1) + ": ");
            netWorth[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Max of Net worth is: %d", checkMaxInTheArray(netWorth));
    }

    public static int checkMaxInTheArray(int[] netWorth) {
        int max = netWorth[0];
        int j = 0;
        while (j < netWorth.length) {
            if (max < netWorth[j]) {
                max = netWorth[j];
            }
            j++;
        }
        return max;
    }
}
