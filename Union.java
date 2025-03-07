
// Union of 2 Arrays.

public class Union {
    static void pUnion(int a[], int b[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            } else if (b[j] < a[i]) {
                System.out.print(b[j++] + " ");
            } else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }

        while (i < m) {
            System.out.print(a[i++] + " ");
        }
        while (j < n) {
            System.out.print(b[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 7 };
        int[] b = { 2, 3, 5, 6 };
        int m = a.length;
        int n = b.length;
        System.out.println("Union ->");
        pUnion(a, b, m, n);
    }
}
