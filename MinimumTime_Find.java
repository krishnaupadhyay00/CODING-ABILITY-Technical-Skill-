//Objective: 

// Given a integer a of size n, in 1 second you can increase the value of 1 element by 1. 
       //find the minimum time in seconds to make all elements of the array equal.

// Observation:

// Array ke sab elements ko equal banane ke liye unhe maximum value ke barabar kiya jata hai.
// Har +1 increment = 1 second lagta hai.
// Jo element jitna max se chhota hota hai, utna hi time lagta hai.
// Total minimum time = (max − a₁) + (max − a₂) + ... + (max − aₙ)

// Pseudocode:

// Start
// Initialize an integer array
// Find the length of the array
// Find the maximum element in the array
// Initialize time = 0
// For each element of the array
// Subtract the element from the maximum value
// Add the difference to time
// Print the total time
// Stop


public class MinimumTime_Find{

    public static void main(String[] args) {

        int[] num = {2, 4, 1, 3};
        int n = num.length;

        int max = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - num[i]);
        }

        System.out.println(time);
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
