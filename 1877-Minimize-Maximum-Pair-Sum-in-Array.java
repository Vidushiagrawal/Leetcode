class Solution {
    public int minPairSum(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<l/2;i++)
        max=Math.max(max,nums[i]+nums[l-1-i]);
        return max;
    }
}