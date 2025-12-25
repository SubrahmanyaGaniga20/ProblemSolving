class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return new int[]{0};
        }
        int[] Psum = new int[n];
        int[] Ssum = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum1 += nums[i];
            Psum[i] = sum1;
            sum2 += nums[j];
            Ssum[j] = sum2;
        }

        int[] ans = new int[n];
        ans[0] = Ssum[1];
        ans[n - 1] = Psum[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = Math.abs(Psum[i - 1] - Ssum[i + 1]);
        }

        return ans;
    }
}
