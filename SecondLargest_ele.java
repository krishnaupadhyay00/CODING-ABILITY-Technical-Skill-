//You are given an integer array A. You have to find the second largest element/value 
//in the array or report that no such element exists.

public class SecondLargest_ele {
    public static void main(String args[]){
        int[] arr = {10,20,40,30,50};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        int secondLargest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }
}
