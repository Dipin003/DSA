public class ArmstrongNumber {
    public static void armStrong(int n) {
        int d = n; // Copy of original number
        int count = 0;
        int temp = n;

        // Count the number of digits in n,
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int arm = 0;
        d = n; // Reset d to n

        // Compute the sum of digits raised to the power of count
        while (d > 0) {
            int rev = d % 10;
            arm += Math.pow(rev, count); // rev^count
            d /= 10; // Remove last digit
        }

        // Check if Armstrong number
        if (arm == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        armStrong(153); // ✅ Armstrong number (1³ + 5³ + 3³ = 153)
        armStrong(9474); // ✅ Armstrong number (9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474)
        armStrong(123); // ❌ Not an Armstrong number
    }
}

// import java.lang.Math;

// public class ArmstrongNumber {
// // Function to check if a
// // number is an Armstrong number
// public static boolean isArmstrong(int num) {
// // Calculate the number of
// // digits in the given number
// int k = String.valueOf(num).length();
// // Initialize the sum of digits
// // raised to the power of k to 0
// int sum = 0;
// // Copy the value of the input
// // number to a temporary variable n
// int n = num;
// // Iterate through each
// // digit of the number
// while(n > 0){
// // Extract the last
// // digit of the number
// int ld = n % 10;
// // Add the digit raised to
// // the power of k to the sum
// sum += Math.pow(ld, k);
// // Remove the last digit
// // from the number
// n = n / 10;
// }
// // Check if the sum of digits raised to
// // the power of k equals the original number
// return sum == num ? true : false;
// }

// public static void main(String[] args) {
// int number = 153;
// if (isArmstrong(number)) {
// System.out.println(number + " is an Armstrong number.");
// } else {
// System.out.println(number + " is not an Armstrong number.");
// }
// }
// }
