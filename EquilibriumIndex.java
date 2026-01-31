//Objective: 

// To find the Equilibrium Index of an array using the prefix sum technique, 
// where the sum of elements on the left side of an index is equal to the sum 
// of elements on the right side.

// Observation:

// For the given array {1, 2, 3, 4, 5}, no index satisfies the condition
// Left Sum = Right Sum.
// Hence, no equilibrium index is found.

// Pseudocode:

// Read the array and calculate its length.
// Create a prefix sum array to store cumulative sums.
// For each index, calculate the left sum using prefix values.
// Calculate the right sum by subtracting the current prefix sum from the total sum.
// Compare left sum and right sum.
// If both are equal, that index is the equilibrium index.


public class EquilibriumIndex {

    public static void main(String args[]) {
        int num[] = {1, 3, 5, 2, 2};

        int n = num.length;

        int prefix[] = new int[n];
        prefix[0] = num[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < n; i++) {
            int lsum = (i == 0) ? 0 : prefix[i - 1];
            int rsum = prefix[n - 1] - prefix[i];
            if (lsum == rsum) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
