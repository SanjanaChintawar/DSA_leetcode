class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        int sum=0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > ans){
                 ans = sum;
                 sum = 0;
            }
            else sum = 0;
        }
        return ans;
    }
}