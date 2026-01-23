//Question:- To calculate the prefix sum of a given array using the Data Structures and Algorithms (DSA) concept in Java.

        //Observation:-

// The prefix sum technique helps in calculating cumulative sums of an array efficiently.
// Each element of the prefix array stores the sum of all elements from the start up to that index.
// This approach avoids repeated addition and reduces time complexity for sum-related problems.
// Prefix sums are very useful in range sum queries and optimization problems in DSA.

          // Pseudocode:-

// An array of elements is taken.
// The first element of the prefix array is assigned the first element of the original array.
// Each next prefix value is obtained by adding the current element to the previous prefix sum.
// Finally, the prefix sum array is displayed.

   // Final Code:-

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }
}

// Time Complexity:O(n)
// Space Complexity:O(n)