                        // Objective:-

//Given N array element find count num of element having at least 1 element greater than itself.

                         //Observation :-

// The program finds how many elements in the array have at least one element greater than themselves.

// First, it determines the maximum element in the array.

// Then, it counts how many times this maximum element appears.

// The maximum element does not have any greater element.

// All other elements are smaller than the maximum, so they each have at least one greater element.


                        //Pseudocode:-

// An array of elements is given.
// The first element is considered as the maximum value.
// The array is scanned to find the largest element and count how many times it occurs.
// The count of maximum elements is subtracted from the total number of elements.
// The result gives the number of elements that have at least one element greater than themselves.

                      //Final Code:

public class CountElement {
    public static void main(String args[]) {
        int arr[] = {-3, 2, 5, 4, 7, 6, 7};

        int n = arr.length;

        int max = arr[0];
        int countMax = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                countMax = 1;
            } else if (arr[i] == max) {
                countMax++;
            }
        }

        int result = n - countMax;

        System.out.println("Greater element: " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
