// sort the array of 0 , 1 and 2 .

// Solution 1 using Count Sorting.

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int a[] = { 0, 1, 2, 1, 2, 0 , 1 ,2 };
        int zero = 0, one = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                zero++;
            if (a[i] == 1)
                one++;
        }
        for (int i = 0; i < zero; i++)
            a[i] = 0;
        for (int i = zero; i < one + zero; i++)
            a[i] = 1;
        for (int i = zero + one; i < a.length; i++)
            a[i] = 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
