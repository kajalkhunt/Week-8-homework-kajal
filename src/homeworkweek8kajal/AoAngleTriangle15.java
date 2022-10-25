package homeworkweek8kajal;

//15. Display left angle triangle of * using nested for loops
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
public class AoAngleTriangle15 {

    public static void main(String[] args) {

        int x;
        int y;
        int z=10;

        // 1st loop
        for (x = 0; x < z; x++) {

            // nested 2nd loop
            for (y = 2 * (z - x); y >= 0; y--) {
                // printing spaces
                System.out.print(" ");
            }
            // nested 3rd loop
            for (y = 0; y <= x; y++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }
}
