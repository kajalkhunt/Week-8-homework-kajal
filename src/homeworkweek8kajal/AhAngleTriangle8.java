package homeworkweek8kajal;

import java.util.Scanner;

//8. Display right angle triangle of @ using nested for loops
// @
// @@
// @@@
// @@@@
// @@@@@
public class AhAngleTriangle8 {

    public static void main(String args[]) {
        int i;
        int j;
        int rows;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = scanner.nextInt();
scanner.close();

        for (i = 1; i <= rows; i++) {
          for (j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}
