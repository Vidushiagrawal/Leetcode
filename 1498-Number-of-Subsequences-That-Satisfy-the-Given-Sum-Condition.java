class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
     int i=0,j=nums.length-1,c=0,mod=(int)1e9 + 7;
        int[] a=new int[nums.length]; 
        a[0]=1;
        for(int k=1;k<nums.length;k++)
            a[k]=(a[k-1]*2)%mod;  
        
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                c=(c+a[j-i])%mod;
                i++;

            } else if(nums[i]+nums[j]>target)
            j--;
        }
            return c;
            
        
    }
}