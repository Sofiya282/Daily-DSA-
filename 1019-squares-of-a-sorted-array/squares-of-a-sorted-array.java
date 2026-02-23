class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]* nums[i];
        }
        for(int i = 0; i<nums.length - 1;i++){
            for (int j=0; j<nums.length -1 - i ;j++){
                if (nums[j+1]<nums[j]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    
                }
            }
        }
        return nums;
    }
}