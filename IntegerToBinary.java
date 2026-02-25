public class BinaryExample {
    public static String toBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);  // get remainder (0 or 1)
            n /= 2;            // divide by 2
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinary(1));   // 1
        System.out.println(toBinary(4));   // 100
        System.out.println(toBinary(12));  // 1100
       // OR
      System.out.println(Integer.toBinaryString(12)); 
    }
}
