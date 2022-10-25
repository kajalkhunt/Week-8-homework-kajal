package homeworkweek8kajal;

import java.util.Scanner;

//2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.
public class AbMinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        minMax();
    }
    public static void minMax() {

        Scanner scn = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
        int amountOfNumbers = 0;
        do {
            System.out.print("Enter any number, or enter less than '0' to stop: ");
            number = scn.nextInt();
            if (number < 0) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            sum += number;
            amountOfNumbers++;
        } while (number >= 0);

        if (amountOfNumbers > 0) {
            //double average = sum / amountOfNumbers;
            System.out.printf("The smallest number is: %d.%n", smallestNumber);
            System.out.printf("The largest number is: %d.%n", largestNumber);
            //System.out.printf("The average of all numbers is: %.4f.%n", average);
        }
    }

}
