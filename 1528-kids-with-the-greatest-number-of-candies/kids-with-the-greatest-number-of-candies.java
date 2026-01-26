class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int great=0;
         for(int j = 0; j< candies.length; j++){
                if(candies[j] > great){
                    great = candies[j];
                }
            }

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) < great ){
                ans.add(i, false);
            }
            else ans.add(i,true);     
            
        }

        return ans;
    }
}