package ArrayPractice;

import java.util.Scanner;

public class CountCharInTheString {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("generate a string and count how many times each character in the string occurs");
        String string;

        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter the String:");
        string = inputString.nextLine();
        char word = 't';
        try{
            System.out.println("Moi ban nhap 1 ky tu");
            word = (char) System.in.read();
            System.out.println("Ky tu vua nhap:" + word); // đưa lên đây để khi read() gặp lỗi nó sẽ không in ký tự mặc định.
        }catch(Exception e){
            System.out.println("Nhap loi!");
        }
        //check length of string System.out.println(string.length());
        int result = getCount(string, word);
        if (result == 0) {
            System.out.printf("%s is not in the String", word);
        } else {
            System.out.printf("%s appears %d in the String", word, result);
        }
    }

    private static int getCount(String string,  char word) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (word == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
