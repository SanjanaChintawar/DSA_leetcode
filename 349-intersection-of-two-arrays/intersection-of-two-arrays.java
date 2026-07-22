class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {    
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int a : nums1){
            set1.add(a);
        }
        
        for(int a : nums2){
            if(set1.contains(a)){
                result.add(a);
            }
        }

        int[] ans = new int[result.size()];
        int index = 0;
        for(int num : result){
            ans[index] = num;
            index++;
        }
        return ans;
    }
}