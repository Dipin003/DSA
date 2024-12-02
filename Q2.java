// Q2 Find Max and Min in an Array.

public class Q2 {

    public static void main(String[] args) {
        int[] a = { 24, 6, 56, 9, 12, 43, 2 };
        int max, min;

        if (a[0] > a[1]) {
            max = a[0];
            min = a[1];
        }

        else {
            max = a[1];
            min = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum Value is " + max);
        System.out.println("Minimum Value is " + min);
    }
}
