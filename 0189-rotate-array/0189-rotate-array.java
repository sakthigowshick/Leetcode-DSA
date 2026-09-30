class Solution {
    public void rotate(int[] nums, int k) {
        int[] s=new int[nums.length];
        k = k % nums.length; 
        int d=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            s[d++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++)
        {
            s[d++]=nums[i];
        }
         for (int i = 0; i < nums.length; i++) {
            nums[i] = s[i];
        }
        
    }

}