class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
            } else set.add(num);
        }
        for(int num: set){
            result = num;
        }

        return result;
        
    }
}