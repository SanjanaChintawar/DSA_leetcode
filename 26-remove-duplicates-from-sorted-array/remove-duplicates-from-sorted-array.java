class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}