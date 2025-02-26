public class CountDigit {
    public static int countDigit(int n) {
        if (n == 0) return 1; // Special case for 0
        return (int) Math.log10(n) + 1; // Log method to count digits
    }

    public static void main(String[] args) {
        int n = 1234567890;
        System.out.println("Count of Digits -> " + countDigit(n));
    }
}
