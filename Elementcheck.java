//Given N array element check if there exits a pair(i,j) such that arr[i]+arr[j] == K and i!=j.
//Note : I and j are index value K is given sum.

public class Elementcheck{
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, 3, 6, 8};
        int k = 10;
        boolean result = PairWithSum(arr, k);
        System.out.println(result);
    }
    public static boolean PairWithSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
