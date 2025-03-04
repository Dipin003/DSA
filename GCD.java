public class GCD {
    public static void greatestCommonFactor(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.max(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b; // Reduce a
            } else {
                b = b % a; // Reduce b
            }
        }
        return (a == 0) ? b : a; // Return non-zero value
    }

    public static void main(String[] args) {
        greatestCommonFactor(9, 12);
        int n1 = 20, n2 = 15;
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

// public class Main {

// public static void main(String[] args) {
//
// }
// }
