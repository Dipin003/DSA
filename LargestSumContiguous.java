// Q8 Kadane Algorithm Larget sum Contiguous Subarray.. (V.v imp) 

public class LargestSumContiguous {

    static void maxSumSubArray(int[] a) {

        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < a.length; i++) {
            currSum = currSum + a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum <= 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum SubArray is -> " + maxSum);
    }

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSumSubArray(a);
    }
}
