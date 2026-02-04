class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ele = nums[nums.length/2];

        return ele;
    }
}