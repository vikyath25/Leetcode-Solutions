class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int len = nums.length;
        int[] a = new int[len];
        for(i=0;i<len-1;i++){
            a[i] = nums[i];
            for(j=i+1;j<len;j++){
                int sum = a[i] + nums[j];
                if(sum == target)
                    return new int[]{i, j};
            }
        }
        return new int[] {};
    }
}