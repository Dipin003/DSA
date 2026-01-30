class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
