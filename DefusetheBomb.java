class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int []r = new int[n];
        
        if(k == 0) return r;

        for(int i=0 ; i<n ; i++) {
            int sum = 0;

            if(k > 0) {
                for(int j=1 ; j<=k ; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for(int j=1 ; j<= -k ; j++) {
                    sum += code[(i-j +n) %n];
                }
            }
            r[i] = sum;
        }
        return r;
    }
}
