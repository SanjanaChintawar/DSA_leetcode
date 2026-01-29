class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++ ){
            int digit = 0;
            // int digit = (int)Math.floor(Math.log10(Math.abs(nums[i]))) + 1;
            while(nums[i] > 0){
                int d = nums[i] % 10;
                digit++;
                nums[i] = nums[i] / 10;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
}