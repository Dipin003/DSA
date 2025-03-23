
// Q7 Rotate an Array by one Cyclically.

public class RotateArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int x = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = x;

        System.out.println("Array After one Cyclic Rotation is -> ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
