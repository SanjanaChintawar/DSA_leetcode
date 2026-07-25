class Solution {
    public int[] findErrorNums(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
        int[] miss = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                miss[0] = nums[i];
            }
            set.add(nums[i]);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                miss[1] = i;
            }
        }

        return miss;
        
    }
}