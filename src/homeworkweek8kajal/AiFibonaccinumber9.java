package homeworkweek8kajal;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class AiFibonaccinumber9 {

    public static void main(String[] args) {

        int num, firstnumber= 1, secondNumber = 1;
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.print("Fibonacci series till " + num + " terms :");
        scanner.close();
        for (int i = 1; i <= num; ++i){
            System.out.print(firstnumber + " ");

            int nextNum = firstnumber + secondNumber;
            firstnumber = secondNumber;
            secondNumber = nextNum;

        }
    }
}