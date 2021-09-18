package ArrayPractice;

import java.util.Scanner;

public class ElementInArray {
    public static void main(String[] args) {
        System.out.println("Find the element in the Arrays");
        String student[] = {"Long", "Toàn", "Thảo", "Tuấn", "Duy"};
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the student who you want to check:");
            String inputStudent = scanner.nextLine();
            if (checkStudent(student, inputStudent) == -1) {
                System.out.println(inputStudent + " in not in the array, you can check another students:");
            } else {
                System.out.println(inputStudent + " is student at index " + checkStudent(student, inputStudent));
            }
        } while (student.length == 0);

    }

    public static int checkStudent(String[] student, String inputStudent) {
        int check = -1;
        for (int i = 0; i < student.length; i++) {
            if (inputStudent.equals(student[i])) {
                check = i;
                return check;
            }
        }
        return check;
    }
}
