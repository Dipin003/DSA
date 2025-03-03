// Q3 Find Kth max and min

import java.util.Arrays;
import java.util.Collections;

public class KthMinMax {

    static void KthSmallest(Integer a[], int k) {
        Arrays.sort(a);
        System.out.println("Kth Smallest: " + a[k - 1]);
    }

    static void KthLargest(Integer a[], int l) {
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Kth Largest: " + a[l - 1]);
    }

    public static void main(String[] args) {
        Integer[] a = { 21, 4, 15, 23, 12, 3, 5 };
        int k = 1;
        int l = 1;

        KthSmallest(a, k);
        KthLargest(a, l);
    }
}
