class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        //  for(int j = 0; j< candies.length; j++){
        //         if(candies[j] > great){
        //             great = candies[j];
        //         }
        //     }

        int[] arr = Arrays.copyOf(candies, candies.length);
        Arrays.sort(arr);
        int great = arr[arr.length-1];

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) < great ){
                ans.add(i, false);
            }
            else ans.add(i,true);     
            
        }

        return ans;
    }
}