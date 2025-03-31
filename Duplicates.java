// Q11 Duplicate in array of n+1 integers.

public class Duplicates {
    public static void main(String[] args) {
        int a[] = {5, 1, 2, 3, 4, 4, 5, 6, 3 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[i]);
            }
        }
    }
}
