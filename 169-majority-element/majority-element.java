class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result = 0;
        int number=0;
        for(int num: nums){
            if(map.get(num) > result){
                result = map.get(num);
                number = num;
            }
        }
        return number;
    }
}