class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int a: nums){
            set.add(a);
        }

        for(int i = 0; i < nums.length+1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }    
}