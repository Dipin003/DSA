// Q16 Best Time to Buy and Sell Stock..
public class BestTimeToBuyAndSellStock {
    static void BuySell(int a[]) {
        int maxProfit = 0;
        int minSoFar = a[0];

        for(int i=0 ; i<a.length ; i++) {
            minSoFar = Math.min(minSoFar , a[i]);
            int Profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit , Profit);
        }
System.out.println("Best Time to Buy a Stock is "+minSoFar);
System.out.println("Best Time to Sell a Stock is "+maxProfit);

    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 4, 8, 7, 2, 5 };
        BuySell(a);
    }
}
