//Q1 Reverse an Array

// Time complexity is O(n)

public class ReverseArray {
    static void revArray(int a[]) {
        int start = 0, end = a.length - 1, c;

        while (start <= end) {
            c = a[start];
            a[start] = a[end];
            a[end] = c;
            start++;
            end--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 5, 6 };
        revArray(a);
    }
}

// Normal Approach

// import java.util.*;

// public class Q1 {
// public static void main(String[] args) {
// int n;
// Scanner sc = new Scanner(System.in);
// System.out.println("Input size of Array -> ");
// n = sc.nextInt();
// int a[] = new int[n];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }

// System.out.println("Reverse Array is ");
// for (int i = n - 1; i >= 0; i--) {
// System.out.print(a[i] + " ");
// }
// }
// }
