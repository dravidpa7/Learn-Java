public class Prob22 {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pyramid

        for (int i = 0; i < n; i++) { // Outer loop for rows
            // Loop for spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // Print spaces (double space for alignment)
            }

            // Loop for stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* "); // Print stars
            }

            // Move to the next line
            System.out.println();

        }
        for (int i = n - 2; i >= 0; i--) { // Start one row less than the top row
            // Spaces before stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Stars in the row
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();

        }

    }
}