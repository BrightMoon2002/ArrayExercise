package ArrayPractice;

import java.util.Scanner;

public class CountCharInTheString {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("generate a string and count how many times each character in the string occurs");
        String string;
        int count = 0;

        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter the String:");
        string = inputString.nextLine();
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter the char:");
        String word = inputWord.nextLine();
    }
}
