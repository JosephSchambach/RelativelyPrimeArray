public class RelativelyPrimeArray {
    public static void main(String[] args) {
        // Get number from user
        int n = Integer.parseInt(args[0]);
        // Create 2-d array from users number
        Boolean[][] rpa = new Boolean[n + 1][n + 1];

        // Loop for storing values inside of the array
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                // Check if i and j are equal and print a space
                if (j == i) {
                    StdOut.print(" ");
                }
                // Print the numbers on the first row
                else if (i == 0) {
                    StdOut.print(j);
                }
                // Print the numbers on the first column
                else if (j == 0) {
                    StdOut.print(i);
                }
                // Else go through the loop to decipher if GCD
                else {
                    // Get variables based on the for loops
                    int x = i;
                    int y = j;
                    // If x if greater than y, swap the numbers
                    if (x > y) {
                        int tmp = x;
                        x = y;
                        y = tmp;
                    }
                    // Find the GCD by dividing by the remainer until 0
                    while (x % y > 0) {
                        int remainder = x % y;
                        x = y;
                        y = remainder;
                    }
                    // If the GCD is 1, then they are prime and print T
                    if (y == 1) {
                        rpa[i][j] = true;
                        StdOut.print("T");
                    }
                    // Otherwise they are not prime and print F
                    else {
                        rpa[i][j] = false;
                        StdOut.print("F");
                    }
                }
            }
            // Print a new line
            StdOut.println();
        }
    }
}