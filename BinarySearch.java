//Binary Search is a searching algorithm for finding an element's position in a sorted array.

           // Observation:-

// Binary search is used to find an element in a sorted array.
// The array is divided into two parts again and again until the element is found.
// This method reduces comparisons and works faster than linear search.

           //Pseudocode:-

// The array is first sorted.
// Low and high positions are taken.
// The middle element is compared with the searched element.
// If equal, the position is found.
// Otherwise, search continues in the left or right part.

          //Final code:-
import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int num[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        System.out.print("Searched Element: ");
        int ele = sc.nextInt();

        int low = 0, high = n - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (num[mid] == ele) {
                pos = mid;
                break;
            } else if (num[mid] < ele) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            System.out.println("Element found at position: " + pos);
        } else {
            System.out.println("Not found");
        }
    }
}

//Time Complexity:- O(log n)
//Space Complexity:- O(1)
