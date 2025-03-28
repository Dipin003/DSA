// Q10  Minimum no of Jumps to Reach end of an Array..

public class MinJump {

    static int jump(int[] a) {

        if (a.length <= 1)
            return 0;

        int maxR = a[0];
        int step = a[0];
        int jump = 1;

        for (int i = 1; i < a.length; i++) {
            if (i == a.length - 1)
                return jump;

            if (i + a[i] > maxR)
                maxR = i + a[i];
            step--;
            if (step == 0) {
                jump++;
                step = maxR - i;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int j = jump(a);
        System.out.println(j);
    }
}
