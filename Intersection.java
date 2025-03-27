
// Intersection of 2 Arrays.

public class Intersection {

    static void intersection(int a[], int b[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 7 };
        int[] b = { 2, 3, 5, 6 };
        int m = a.length;
        int n = b.length;
        System.out.println("Instersection -> ");
        intersection(a, b, m, n);
    }
}
